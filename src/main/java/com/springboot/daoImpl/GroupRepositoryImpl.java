package com.springboot.daoImpl;

import java.util.ArrayList;
import java.util.List;

import com.springboot.model.Event;
import com.springboot.repository.GroupRepository;

public class GroupRepositoryImpl implements GroupRepository {

	@Override
	public List<Event> getListofJoinData() {
		List<Event> allList = new ArrayList<>();
		return allList;
	}

}
