package org.dbModule.dao;

import org.dbModule.domain.Project;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Repository(value = "projectDao")
@Transactional(propagation = Propagation.MANDATORY)
public class ProjectDaoImpl implements ProjectDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void addProject(Project project) {
	Session session = sessionFactory.getCurrentSession();
	session.save(project);
    }

    @Override
    public void deleteProject(Integer id) {
	Project project = getProject(id);
	if(project != null){
	    Session session = sessionFactory.getCurrentSession();
	    session.delete(project);
	}
    }

    @Override
    public Project getProject(Integer projectId) {
	Session session = sessionFactory.getCurrentSession();
	Project project = (Project)session.get(Project.class, projectId);
	return project;
    }
}
