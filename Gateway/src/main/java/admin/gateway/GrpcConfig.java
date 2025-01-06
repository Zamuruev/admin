package admin.gateway;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import proto.files.MovieServiceGrpc;

@Configuration
public class GrpcConfig {

    @Bean
    public MovieServiceGrpc.MovieServiceBlockingStub grpcStub() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("domain-service", 9090)
                .usePlaintext()
                .intercept(new LoggingInterceptor())
                .build();
        return MovieServiceGrpc.newBlockingStub(channel);
    }
}