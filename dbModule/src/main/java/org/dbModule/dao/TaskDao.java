package org.dbModule.dao;

import org.dbModule.domain.Task;

public interface TaskDao {
	
	void addTask(Task task);
	void updateTask(Task task);
	Task getTask(Integer taskId);

}
