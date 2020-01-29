package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
	
	@GetMapping("/")
	public String WelcomePage() {
		return "Welcome to REST ";
	}
	
	@GetMapping("/rest")
	public String WelcomeHome() {
		return "Welcome to REST ";
	}

}
