package org.dbModule.dao;

import java.util.List;

import org.dbModule.domain.Project;


public interface ProjectDao {
	
	void addProject(Project project);
	void deleteProject(Integer id);
	Project getProject(Integer projectId);
	List<Project> getAllProjects(); 

}
