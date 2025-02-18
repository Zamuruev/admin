package admin.domain;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue movieQueue() {
        return new Queue("movieQueue", true); // Очередь для сообщений
    }
}
