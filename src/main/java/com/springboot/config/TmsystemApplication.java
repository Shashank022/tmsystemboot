package com.springboot.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.*")
@EntityScan("com.springboot.*")
@EnableJpaRepositories("com.springboot.*")
public class TmsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmsystemApplication.class, args);
	}

	
	
}
