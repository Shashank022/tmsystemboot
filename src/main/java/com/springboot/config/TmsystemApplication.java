package com.springboot.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.*")
public class TmsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmsystemApplication.class, args);
	}

}
