package org.dbModule.domain;

import java.io.Serializable;
import java.util.List;

public class Project implements Serializable{
	
	private Integer id;
	private List<Task> taskList;

	public Project() {
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}
}
