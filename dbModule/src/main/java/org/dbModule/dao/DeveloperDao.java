package org.dbModule.dao;

import org.dbModule.domain.Developer;

public interface DeveloperDao {
	
	void addDeveloper(Developer developer);
	void deleteDevelpoer(Integer developerId);
	Developer getDeveloper(Integer developerId);
	void editDeveloper(Developer developer);
	
}
