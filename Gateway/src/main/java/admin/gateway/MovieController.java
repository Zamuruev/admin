package admin.gateway;

import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    public MovieController(MovieServiceGrpc.MovieServiceBlockingStub grpcStub, RedisTemplate<String, Object> redisTemplate) {
        this.grpcStub = grpcStub;
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovie(@PathVariable Long id) {
        String cacheKey = "movie:" + id;
        try {
            logger.debug("Запрос фильма с ID: {}", id);
            if (Boolean.TRUE.equals(redisTemplate.hasKey(cacheKey))) {
                logger.info("Фильм найден в кэше: {}", redisTemplate.opsForValue().get(cacheKey));
                return ResponseEntity.ok(redisTemplate.opsForValue().get(cacheKey));
            }
            GetMovieRequest request = GetMovieRequest.newBuilder().setId(id).build();
            logger.info("Выполняется вызов gRPC для получения фильма с ID: {}", id);
            GetMovieResponse response = grpcStub.getMovie(request);
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setYear(response.getMovie().getYear());
            movieDTO.setDirector(response.getMovie().getDirector());
            movieDTO.setGenre(response.getMovie().getGenre());
            movieDTO.setTitle(response.getMovie().getTitle());
            movieDTO.setId(response.getMovie().getId());
            logger.info("Фильм получен из gRPC: {}", movieDTO);
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
        logger.debug("Получен запрос на создание фильма: {}", movie);
        try {
            CreateMovieRequest request = CreateMovieRequest.newBuilder()
                    .setTitle(movie.getTitle())
                    .setDirector(movie.getDirector())
                    .setGenre(movie.getGenre())
                    .setYear(movie.getYear())
                    .build();
            logger.info("Выполняется вызов gRPC для создания фильма: {}", movie);
            grpcStub.createMovie(request);
            logger.info("Фильм успешно создан: {}", movie);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            logger.error("Ошибка при создании фильма: {}", e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Timed("movies.update_movie")
    @PutMapping("/{id}")
    public ResponseEntity<?> updateMovie(@PathVariable Long id, @RequestBody MovieDTO movie) {
        logger.debug("Получен запрос на обновление фильма с ID {}: {}", id, movie);
        try {
            Movie updatedMovie = Movie.newBuilder()
                    .setId(id)
                    .setTitle(movie.getTitle())
                    .setDirector(movie.getDirector())
                    .setGenre(movie.getGenre())
                    .setYear(movie.getYear())
                    .build();
            logger.info("Выполняется вызов gRPC для обновления фильма с ID {}: {}", id, updatedMovie);
            grpcStub.updateMovie(updatedMovie);
            String cacheKey = "movie:" + id;
            redisTemplate.delete(cacheKey);
            logger.debug("Кэш для фильма с ID {} удалён", id);
            logger.info("Фильм с ID {} успешно обновлён", id);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            logger.error("Ошибка при обновлении фильма с ID {}: {}", id, e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Timed("movies.delete_movie")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable Long id) {
        logger.debug("Получен запрос на удаление фильма с ID {}", id);
        try {
            GetMovieRequest request = GetMovieRequest.newBuilder().setId(id).build();
            logger.info("Выполняется вызов gRPC для удаления фильма с ID {}", id);
            grpcStub.deleteMovie(request);
            String cacheKey = "movie:" + id;
            redisTemplate.delete(cacheKey);
            logger.debug("Кэш для фильма с ID {} удалён", id);
            logger.info("Фильм с ID {} успешно удалён", id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            logger.error("Ошибка при удалении фильма с ID {}: {}", id, e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}

