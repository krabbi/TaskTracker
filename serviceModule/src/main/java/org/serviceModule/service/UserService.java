package org.serviceModule.service;

import org.dbModule.domain.User;

public interface UserService {

    void addUser(User user);
    User getUser(Integer userId);
    void deleteUser(Integer userId);
}
