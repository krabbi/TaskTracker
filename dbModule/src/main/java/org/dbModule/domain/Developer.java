package org.dbModule.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@DiscriminatorValue("DEVELOPER")
@Table(name = "DEVELOPER")
public class Developer extends User{

	@Column(name = "TASK_LIST")
	@OneToMany(mappedBy = "developer", cascade = CascadeType.ALL)
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
