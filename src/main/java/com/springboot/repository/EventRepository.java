package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {


}
 