package admin.gateway;

import io.micrometer.core.annotation.Timed;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proto.files.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieServiceGrpc.MovieServiceBlockingStub grpcStub;
    private final RedisTemplate<String, Object> redisTemplate;

    public MovieController(MovieServiceGrpc.MovieServiceBlockingStub grpcStub, RedisTemplate<String, Object> redisTemplate) {
        this.grpcStub = grpcStub;
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovie(@PathVariable Long id) {
        String cacheKey = "movie:" + id;
        try {
            System.out.println("Получить фильм с id = " + id);
            if (Boolean.TRUE.equals(redisTemplate.hasKey(cacheKey))) {
                return ResponseEntity.ok(redisTemplate.opsForValue().get(cacheKey));
            }
            GetMovieRequest request = GetMovieRequest.newBuilder().setId(id).build();
            GetMovieResponse response = grpcStub.getMovie(request);
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setYear(response.getMovie().getYear());
            movieDTO.setDirector(response.getMovie().getDirector());
            movieDTO.setGenre(response.getMovie().getGenre());
            movieDTO.setTitle(response.getMovie().getTitle());
            movieDTO.setId(response.getMovie().getId());
            System.out.println("Получен фильм с id = " + id + ", " + movieDTO);
            redisTemplate.opsForValue().set(cacheKey, movieDTO, 5, TimeUnit.MINUTES);
            return ResponseEntity.ok(movieDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Timed("movies.create_movie")
    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> createMovie(@RequestBody MovieDTO movie) {
        System.out.println("Received Movie: " + movie);
        CreateMovieRequest request = CreateMovieRequest.newBuilder()
                .setTitle(movie.getTitle())
                .setDirector(movie.getDirector())
                .setGenre(movie.getGenre())
                .setYear(movie.getYear())
                .build();
        grpcStub.createMovie(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Timed("movies.update_movie")
    @PutMapping("/{id}")
    public ResponseEntity<?> updateMovie(@PathVariable Long id, @RequestBody MovieDTO movie) {
        Movie updatedMovie = Movie.newBuilder()
                .setId(id)
                .setTitle(movie.getTitle())
                .setDirector(movie.getDirector())
                .setGenre(movie.getGenre())
                .setYear(movie.getYear())
                .build();
        System.out.println("Updating movie: " + updatedMovie);
        grpcStub.updateMovie(updatedMovie);
        String cacheKey = "movie:" + id;
        redisTemplate.delete(cacheKey);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Timed("movies.delete_movie")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable Long id) {
        GetMovieRequest request = GetMovieRequest.newBuilder().setId(id).build();
        grpcStub.deleteMovie(request);
        String cacheKey = "movie:" + id;
        redisTemplate.delete(cacheKey);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
