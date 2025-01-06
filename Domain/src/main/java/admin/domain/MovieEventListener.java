package admin.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import admin.domain.models.Movie;
import admin.domain.repositories.MovieRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MovieEventListener {

    private final MovieRepository movieRepository;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public MovieEventListener(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @RabbitListener(queues = "movieQueue")
    public void receiveMovieEvent(String message) {
        try {
            String[] parts = message.split(":", 2);
            String action = parts[0];
            String data = parts[1];

            Movie movie = objectMapper.readValue(data, Movie.class);

            switch (action) {
                case "POST":
                    handleCreate(movie);
                    break;
                case "PUT":
                    handleUpdate(movie);
                    break;
                case "DELETE":
                    handleDelete(movie);
                    break;
                default:
                    System.err.println("Unknown action: " + action);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleCreate(Movie movie) {
        movieRepository.save(movie);
        System.out.println("Created movie: " + movie.getId());
    }

    private void handleUpdate(Movie movie) {
        Movie existingMovie = movieRepository.findById(movie.getId())
                .orElseThrow(() -> new RuntimeException("Movie not found for update"));

        existingMovie.setTitle(movie.getTitle());
        existingMovie.setDirector(movie.getDirector());
        existingMovie.setGenre(movie.getGenre());
        existingMovie.setYear(movie.getYear());

        movieRepository.save(existingMovie);
        System.out.println("Updated movie: " + movie.getId());
    }

    private void handleDelete(Movie movie) {
        movieRepository.deleteById(movie.getId());
        System.out.println("Deleted movie: " + movie.getId());
    }
}
