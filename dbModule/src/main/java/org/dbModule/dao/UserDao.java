package org.dbModule.dao;

import org.dbModule.domain.User;

public interface UserDao {
	
	void addUser(User user);
	User getUser(Integer userId);
	void deleteUser(Integer userId);
	

}
