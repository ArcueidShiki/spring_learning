package org.example.web;

import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(app);
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
