package org.dbModule.dao;

import org.dbModule.domain.Developer;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import org.hibernate.Query;
import java.util.List;

@Repository(value = "developerDao")
@Transactional(propagation = Propagation.MANDATORY)
public class DeveloperDaoImpl implements DeveloperDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void addDeveloper(Developer developer) {
	Session session = sessionFactory.getCurrentSession();
	session.save(developer);
    }

    @Override
    public void deleteDevelpoer(Integer developerId) {
	Developer developer = getDeveloper(developerId);
	if (developer != null){
		Session session = sessionFactory.getCurrentSession();
	        session.delete(developer);
	}
    }

    @Override
    public Developer getDeveloper(Integer developerId) {
	Session session = sessionFactory.getCurrentSession();
	Developer developer = (Developer)session.get(Developer.class, developerId);
	return developer;
    }

    @Override
    public void editDeveloper(Developer developer) {
	Session session = sessionFactory.getCurrentSession();
	session.update(developer);
    }

    @Override
    public List<Developer> getAllDevelopers() {
	Session session = sessionFactory.getCurrentSession();
	Query query = session.createQuery("from Developer d");
	List<Developer> developerList = query.list();
	return developerList;
    }
}
