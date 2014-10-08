package org.serviceModule.service;

import org.dbModule.domain.Task;

public interface TaskService {

    void addTask(Task task);
    void updateTask(Task task);
    Task getTask(Integer taskId);
    Task getInitializedTask(Integer taskId);
}
