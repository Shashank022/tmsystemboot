package com.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

	
}
 