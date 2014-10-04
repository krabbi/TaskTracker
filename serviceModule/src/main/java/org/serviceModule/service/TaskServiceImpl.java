package org.serviceModule.service;

import org.dbModule.dao.TaskDao;
import org.dbModule.domain.Task;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Component(value = "taskService")
@Transactional(propagation = Propagation.REQUIRED)
public class TaskServiceImpl implements TaskService {

    @Resource(name = "taskDao")
    private TaskDao taskDao;

    @Override
    public void addTask(Task task) {
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
}
