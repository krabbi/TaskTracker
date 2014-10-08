package org.serviceModule.service;

import org.dbModule.dao.DeveloperDao;
import org.dbModule.dao.TaskDao;
import org.dbModule.domain.Task;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Component(value = "taskService")
@Transactional(propagation = Propagation.REQUIRED)
public class TaskServiceImpl implements TaskService {

    @Resource(name = "taskDao")
    private TaskDao taskDao;
    
    @Resource(name = "developerDao")
    private DeveloperDao developerkDao;

    @Override
    public void addTask(Task task) {
    	task.setDeveloper(developerkDao.getDeveloper(task.getDeveloper().getId()));
    	taskDao.addTask(task);
    }

    @Override
    public void updateTask(Task task) {
	taskDao.updateTask(task);
    }

    @Override
    public Task getTask(Integer taskId) {
	return taskDao.getTask(taskId);
    }    

    @Override
    public Task getInitializedTask(Integer taskId) {
    	Task task = taskDao.getTask(taskId);
    	Hibernate.initialize(task.getComment());
    	return task;
    }
}
