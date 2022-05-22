package org.example.dao.impl;

import org.example.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*    <bean id="userDao" class="org.example.dao.impl.UserDaoImpl"></bean>*/
//@Component("userDao") // 加注解 效果等同于 配置文件配置了 bean id
//使用语言更加明确的注解
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save running ...");
    }

    public UserDaoImpl() {
        System.out.println("执行了构造方法,创建了UserDao");
    }

}
