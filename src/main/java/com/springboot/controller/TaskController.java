package com.springboot.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.springboot.model.Task;
import com.springboot.service.TaskService;

public class TaskController {

	@Autowired
	TaskService taskService;
	
	@CrossOrigin
	@GetMapping("/tasks")
	public Iterable<Task> retrieveAllTasks() {
		return taskService.getListofTasks();
	}
	
	@GetMapping("/tasks/{id}")
	public Optional<Task> getEventById(@PathVariable int id) {
		return taskService.getTaskById(id);
	}

	@PostMapping("/events")
	public void addEvent(@RequestBody Task task) {
		taskService.addNewTask(task);
	}

}
