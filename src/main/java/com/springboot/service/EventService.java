package com.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Event;
import com.springboot.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	EventRepository eventRepository;
	
	public Iterable<Event> getListofEvents(){ 
		return eventRepository.findAll();
	}

	public void addNewEvent(Event event) {
		eventRepository.save(event);
	}

	public Optional<Event> getEventById(int id) {
		return eventRepository.findById(id);
	}

}
