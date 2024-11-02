package com.kafka.consumer.springbootconsumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

    private Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);


    //recibimos el mensaje
    // groupId -> para formar grupos de consumidores, es obligatorio poner eso
    @KafkaListener(topics = {"ana-topic"}, groupId = "my-group-id")
    public void listener(String message){
        LOGGER.info("Mensaje recibido, el mensaje es: " + message);
    }
}
