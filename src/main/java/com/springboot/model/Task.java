package com.springboot.model;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Task {
	@Id
	@GeneratedValue
	private int task_id;
	private String task_name;
	private String team_id;
	private Date task_created;
	private String task_updated;
	private int event_id;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(int task_id, String task_name, String team_id, Date task_created, String task_updated, int event_id) {
		super();
		this.task_id = task_id;
		this.task_name = task_name;
		this.team_id = team_id;
		this.task_created = task_created;
		this.task_updated = task_updated;
		this.event_id = event_id;
	}
	
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getTeam_id() {
		return team_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	public Date getTask_created() {
		return task_created;
	}
	public void setTask_created(Date task_created) {
		this.task_created = task_created;
	}
	public String getTask_updated() {
		return task_updated;
	}
	public void setTask_updated(String task_updated) {
		this.task_updated = task_updated;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

}
