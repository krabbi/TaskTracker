package org.serviceModule.service;

import org.dbModule.dao.UserDao;
import org.dbModule.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Component(value = "userService")
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void addUser(User user) {
	userDao.addUser(user);
    }

    @Override
    public User getUser(Integer userId) {
	return userDao.getUser(userId);
    }

    @Override
    public void deleteUser(Integer userId) {
	userDao.deleteUser(userId);
    }
}
