package org.dbModule.domain;

import java.io.Serializable;

public class Task implements Serializable{
	
	private Integer id;
	private Developer developer;
	private Comment comment;
	private TaskStatus status;
	
	public Task(){
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}


	public TaskStatus getStatus() {
		return status;
	}


	public void setStatus(TaskStatus status) {
		this.status = status;
	}
	
	

}
