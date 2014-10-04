package org.serviceModule.service;

import org.dbModule.dao.DeveloperDao;
import org.dbModule.domain.Developer;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Component(value = "developerService")
@Transactional(propagation = Propagation.REQUIRED)
public class DeveloperServiceImpl implements DeveloperService {

    @Resource(name = "developerDao")
    private DeveloperDao developerDao;

    @Override
    public void addDeveloper(Developer developer) {
	developerDao.addDeveloper(developer);
    }

    @Override
    public void deleteDevelpoer(Integer developerId) {
	developerDao.deleteDevelpoer(developerId);
    }

    @Override
    public Developer getDeveloper(Integer developerId) {
	return developerDao.getDeveloper(developerId);
    }

    @Override
    public void editDeveloper(Developer developer) {
	developerDao.editDeveloper(developer);
    }
}
