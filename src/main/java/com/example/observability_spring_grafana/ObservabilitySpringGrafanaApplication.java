package com.example.observability_spring_grafana;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.observability_spring_grafana.entities.*;
import com.example.observability_spring_grafana.repositories.ProductRepository;

@SpringBootApplication
public class ObservabilitySpringGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObservabilitySpringGrafanaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository) {
		return args->{
			productRepository.save(new Product("computer",2500));
			productRepository.save(new Product("smart phone",200));
			productRepository.save(new Product("printer",500));
			productRepository.findAll().forEach(System.out::println);
		};
	}
}
