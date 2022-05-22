package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*    <bean id="userService" class="org.example.service.impl.UserServiceImpl">
        </bean>*/
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    /*<property name="userDao" ref="userDao"/>*/
//    @Autowired //按照数据类型class从Spring容器中进行匹配的
//    @Qualifier("userDao") //是按照id值 从容器中进行匹配的。必须结合Autowired 使用
    @Resource(name="userDao") //相当于 Autowired + Qualifier
    private UserDao userDao;
    // 注解方式 set方法可以不写

/*     如果是xml配置 set方法是要写的
    @Autowired
    @Qualifier("userDao")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public void save() {
        userDao.save();
    }
}
