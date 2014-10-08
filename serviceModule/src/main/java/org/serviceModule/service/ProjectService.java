package org.serviceModule.service;

import java.util.List;


import org.dbModule.domain.Project;

public interface ProjectService {

    void addProject(Project project);
    void deleteProject(Integer id);
    Project getProject(Integer projectId);
    List<Project> getAllProjects();
    Project getInitializedProject(Integer projectId);
}
