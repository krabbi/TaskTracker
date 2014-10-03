package org.dbModule.domain;

import java.util.List;

public class Developer extends User{
	
	private List<Task> taskList;
	
	public Developer(){
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}	
	
}
