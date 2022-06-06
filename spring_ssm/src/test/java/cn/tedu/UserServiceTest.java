package cn.tedu;

import cn.tedu.config.SpringConfig;
import cn.tedu.entity.User;
import cn.tedu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testGetById(){
        User user = userService.getById(1);
        System.out.println(user);
    }

    @Test
    public void testGetAll(){
        userService.getAll().forEach(System.out::println);
    }
}
