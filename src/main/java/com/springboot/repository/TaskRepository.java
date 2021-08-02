package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.springboot.model.Task;
import org.springframework.stereotype.Repository;

@Repository
public  interface TaskRepository extends JpaRepository<Task, Integer> {

}
