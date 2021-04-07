package com.xynu.test;

import com.xynu.dao.UserDao;
import com.xynu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("com/xynu/config/applicationContext.xml");

        UserService userService = (UserService) ac.getBean("userService");
        userService.sayHello();

        



    }
}
