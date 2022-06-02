package cn.tedu;

import cn.tedu.config.SpringConfig;
import cn.tedu.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = ctx.getBean("userDaoImpl",UserDao.class);
        System.out.println(userDao);
//        userDao.update();
        System.out.println("userDao.select() = " + userDao.select(1,"asd"));
        System.out.println(userDao.getClass());
    }
}
