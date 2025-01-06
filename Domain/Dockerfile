FROM eclipse-temurin:17-jdk-alpine

# Установка wget и dockerize
RUN apk add --no-cache wget \
    && wget https://github.com/jwilder/dockerize/releases/download/v0.6.1/dockerize-linux-amd64-v0.6.1.tar.gz \
    && tar -xzvf dockerize-linux-amd64-v0.6.1.tar.gz \
    && mv dockerize /usr/local/bin/ \
    && rm -rf dockerize-linux-amd64-v0.6.1.tar.gz

WORKDIR /app
COPY target/Domain-0.0.1-SNAPSHOT.jar app.jar

# Использование dockerize для ожидания RabbitMQ
ENTRYPOINT ["dockerize", "-wait", "tcp://rabbitmq:5672", "-timeout", "2000s", "java", "-jar", "app.jar"]
