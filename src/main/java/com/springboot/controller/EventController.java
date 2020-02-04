package com.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/eventlist/{id}")
	public Optional<Event> getEventById(@PathVariable int id) {
		return eventService.getEventById(id);
	}

	@PostMapping("/addevent")
	public void addEvent(@RequestBody Event event) {
		 eventService.addNewEvent(event);
	}

}
