package com.example.cleanarch.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = {"com.example.cleanarch.*"})
@EnableJpaRepositories(basePackages = {"com.example.cleanarch.data.repository"})
@EntityScan(basePackages = {"com.example.cleanarch.data.entity"})
@SpringBootApplication
public class CleanArchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanArchApplication.class, args);
	}

}
