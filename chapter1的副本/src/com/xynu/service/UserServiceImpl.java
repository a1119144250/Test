package com.xynu.service;

import com.xynu.dao.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void sayHello() {

        this.userDao.say();
        System.out.println("service!");

    }
}
