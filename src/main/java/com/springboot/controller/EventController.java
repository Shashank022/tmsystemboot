package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Event;
import com.springboot.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@GetMapping("/")
	public String WelcomePage() {
		return "Welcome to REST ";
	}
	
	@GetMapping("/eventlist")
	public Iterable<Event> retrieveAllEvents() {
		return eventService.getListofEvents();
	}

}
