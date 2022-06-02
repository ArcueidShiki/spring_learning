package cn.tedu;

import cn.tedu.config.SpringConfig;
import cn.tedu.entity.User;
import cn.tedu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService accountService = ac.getBean(UserService.class);
        User account = accountService.findById(1);
        System.out.println("account = " + account);
    }
}
