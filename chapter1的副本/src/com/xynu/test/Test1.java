package com.xynu.test;

import com.xynu.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("com/xynu/config/applicationContext.xml");

        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.say();

    }
}
