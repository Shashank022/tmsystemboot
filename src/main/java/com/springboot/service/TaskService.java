package com.springboot.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.model.Task;
import com.springboot.repository.TaskRepository;

public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	
	public Iterable<Task> getListofTasks(){ 
		return taskRepository.findAll();
	}

	public void addNewTask(Task task) {
		taskRepository.save(task);
	}

	public Optional<Task> getTaskById(int id) {
		return taskRepository.findById(id);
	}


}
