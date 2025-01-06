package admin.domain;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import proto.files.MovieServiceGrpc;

import java.io.IOException;

@Configuration
public class GrpcServerConfig {

    @Bean
    public Server grpcServer(MovieServiceGrpc.MovieServiceImplBase movieServiceImpl) throws IOException {
        Server server = ServerBuilder.forPort(9090)
                .addService(movieServiceImpl)
                .build()
                .start();
        return server;
    }
}
