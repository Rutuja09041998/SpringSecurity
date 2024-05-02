package com.rutuja.SpringSecutity_InMemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecutityInMemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecutityInMemoryApplication.class, args);
	}

}
