package org.dbModule.dao;

import org.dbModule.domain.Project;

public interface ProjectDao {
	
	void addProject(Project project);
	void deleteProject(Integer id);
	Project getProject(Integer projectId);

}
