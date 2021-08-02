package com.springboot.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.springboot.model.Task;
import com.springboot.service.TaskService;

@CrossOrigin(origins = "http://localhost:5008")
@RestController
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

	@PostMapping("/tasks")
	public void addEvent(@RequestBody Task task) {
		taskService.addNewTask(task);
	}

}
