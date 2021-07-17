package com.springboot.repository;

import java.util.List;
import com.springboot.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository {
	List<Event> getListofJoinData();
	
}
