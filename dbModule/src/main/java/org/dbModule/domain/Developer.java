package org.dbModule.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@DiscriminatorValue("DEVELOPER")
@Table(name = "TEACHER")
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
