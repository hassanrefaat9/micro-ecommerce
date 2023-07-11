package io.nerd.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @KafkaListener(topics = "notificationTopic")
    public void handelNotification (OrderPlacedEvent orderPlacedEvent){
      log.info("Received Notification for Order - {}",orderPlacedEvent.getOrderNumber());
    }
}
