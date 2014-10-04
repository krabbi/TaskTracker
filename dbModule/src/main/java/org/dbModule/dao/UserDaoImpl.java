package org.dbModule.dao;

import org.dbModule.domain.User;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Repository(value = "userDao")
@Transactional(propagation = Propagation.MANDATORY)
public class UserDaoImpl implements UserDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
	Session session = sessionFactory.getCurrentSession();
	session.save(user);
    }

    @Override
    public User getUser(Integer userId) {
	Session session = sessionFactory.getCurrentSession();
	User user = (User) session.get(User.class, userId);
	return user;
    }

    @Override
    public void deleteUser(Integer userId) {
	User user = getUser(userId);
	if (user != null){
	    Session session = sessionFactory.getCurrentSession();
	    session.delete(user);
	}
    }
}
