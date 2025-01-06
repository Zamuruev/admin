package admin.domain;

import admin.domain.models.Movie;
import admin.domain.repositories.MovieRepository;
import com.google.protobuf.util.JsonFormat;
import io.grpc.stub.StreamObserver;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proto.files.*;

@Service
public class MovieServiceImpl extends MovieServiceGrpc.MovieServiceImplBase {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void getMovie(GetMovieRequest request, StreamObserver<GetMovieResponse> responseObserver) {
        try {
            Movie movie = movieRepository.findById(request.getId()).orElseThrow(() -> new RuntimeException("Movie not found"));
            System.out.println("Фильм с id = " + movie.getId() + ",  " + movie);
            GetMovieResponse response = GetMovieResponse.newBuilder().setMovie(mapToProto(movie)).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }


    @Override
    public void createMovie(CreateMovieRequest request, StreamObserver<Empty> responseObserver) {
        try {
            String jsonRequest = JsonFormat.printer().print(request);
            amqpTemplate.convertAndSend("movieQueue", "POST:" + jsonRequest);
            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }

    @Override
    public void updateMovie(proto.files.Movie request, StreamObserver<Empty> responseObserver) {
        try {
            String jsonRequest = JsonFormat.printer().print(request);
            System.out.println("Sent update message to RabbitMQ (JSON): " + jsonRequest);
            amqpTemplate.convertAndSend("movieQueue", "PUT:" + jsonRequest);
            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(e);
        }
    }


    @Override
    public void deleteMovie(GetMovieRequest request, StreamObserver<Empty> responseObserver) {
        String jsonRequest = "{\"id\":" + request.getId() + "}";
        amqpTemplate.convertAndSend("movieQueue", "DELETE:" + jsonRequest);
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }


    private proto.files.Movie mapToProto(Movie movie) {
        return proto.files.Movie.newBuilder()
                .setId(movie.getId())
                .setTitle(movie.getTitle())
                .setDirector(movie.getDirector())
                .setGenre(movie.getGenre())
                .setYear(movie.getYear())
                .build();
    }
}
