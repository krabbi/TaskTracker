package org.serviceModule.service;

import org.dbModule.domain.Developer;

import java.util.List;

public interface DeveloperService {

    void addDeveloper(Developer developer);
    void deleteDevelpoer(Integer developerId);
    Developer getDeveloper(Integer developerId);
    void editDeveloper(Developer developer);
    List<Developer> getAllDevelopers();
}
