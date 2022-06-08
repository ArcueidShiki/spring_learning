package cn.tedu.spring_boot_quickstart;

import cn.tedu.spring_boot_quickstart.dao.UserDao;
import cn.tedu.spring_boot_quickstart.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootQuickstartApplicationTests {

    @Autowired
    private  UserService userService;

    @Autowired
    private UserDao userDao;//需要mybatis自动代理得到

    @Test
    void contextLoads() {
//        userService.save();
    }

    @Test
    void testGetById(){
        System.out.println("userDao.getById(1) = " + userDao.getById(1));
    }
}
