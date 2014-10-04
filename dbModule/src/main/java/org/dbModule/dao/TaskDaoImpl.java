package org.dbModule.dao;

import org.dbModule.domain.Task;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Repository(value = "taskDao")
@Transactional(propagation = Propagation.MANDATORY)
public class TaskDaoImpl implements TaskDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void addTask(Task task) {
	Session session = sessionFactory.getCurrentSession();
	session.save(task);
    }

    @Override
    public void updateTask(Task task) {
	Session session = sessionFactory.getCurrentSession();
	session.update(task);
    }

    @Override
    public Task getTask(Integer taskId) {
	Session session = sessionFactory.getCurrentSession();
	Task task = (Task)session.get(Task.class, taskId);
	return task;
    }
}
