package org.serviceModule.service;

import org.dbModule.domain.Project;

public interface ProjectService {

    void addProject(Project project);
    void deleteProject(Integer id);
    Project getProject(Integer projectId);
}
