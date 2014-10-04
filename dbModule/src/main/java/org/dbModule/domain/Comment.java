package org.dbModule.domain;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Comment implements Serializable{
	
	private Integer id;
	private String comment;
	private User user;
	
	public Comment(){
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
