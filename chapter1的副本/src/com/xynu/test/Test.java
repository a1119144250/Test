package com.xynu.test;

import com.xynu.controller.CustomerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/xynu/config/applicationContext.xml");

        CustomerController customerController = (CustomerController) applicationContext.getBean("customerController");

        customerController.insertC();

        customerController.selectC();

        customerController.editC();

        customerController.deleteC();
    }
}
