package com.kafka.provider.springbootkafkaprovider;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringbootkafkaproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootkafkaproviderApplication.class, args);
	}

	@Bean
	CommandLineRunner init(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			kafkaTemplate.send("ana-topic", "Hola amigos, este sería un mensaje que será escuchado por el consumidor.");
		};
	}
}
