package org.serviceModule.service;


import java.util.List;

import org.dbModule.dao.ProjectDao;
import org.dbModule.domain.Project;
import org.dbModule.domain.Task;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Component(value = "projectService")
@Transactional(propagation = Propagation.REQUIRED)
public class ProjectServiceImpl implements ProjectService {

    @Resource(name = "projectDao")
    private ProjectDao projectDao;

    @Override
    public void addProject(Project project) {
	projectDao.addProject(project);
    }

    @Override
    public void deleteProject(Integer id) {
	projectDao.deleteProject(id);
    }

    @Override
    public Project getProject(Integer projectId) {
	return projectDao.getProject(projectId);
    }

    @Override
    public List<Project> getAllProjects() {
	return projectDao.getAllProjects();
    }

    @Override
    public Project getInitializedProject(Integer projectId) {
    	Project project = projectDao.getProject(projectId); 
    	Hibernate.initialize(project.getTaskList());   	
    	for(Task task: project.getTaskList()){
    		Hibernate.initialize(task.getComment());
    	}
    	return project;
    }
    
}
