package com.springboot.repository;

import java.util.List;
import com.springboot.model.Event;

public interface GroupRepository {
	public List<Event> getListofJoinData();
	
}
