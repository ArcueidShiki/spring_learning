package cn.tedu.mybatis;

import cn.tedu.mybatis.mapper.AdminMapper;
import cn.tedu.mybatis.pojo.Admin;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringJUnitConfig(SpringConfig.class)
public class MyBatisTest {
    @Autowired
    Environment env;
    @Autowired
    DataSource dataSource;
    @Autowired(required = false)
    AdminMapper adminMapper;

    @Test
    public void contextLoads() {
//        System.out.println("MyBatisTest.contextLoads");
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
//        ConfigurableEnvironment environment = ac.getEnvironment();
        System.out.println(env.getProperty("datasource.url"));
        System.out.println(env.getProperty("datasource.driver"));
        System.out.println(env.getProperty("datasource.username"));
        System.out.println(env.getProperty("datasource.password"));
//        ac.close();
    }

    @Test
    public void testConnection() throws Exception {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = ac.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        ac.close();
    }

    @Test
    public void testInsert() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        AdminMapper adminMapper = ac.getBean(AdminMapper.class);
        Admin admin = new Admin();
        admin.setUsername("爱尔奎特");
        admin.setPassword("123");
        adminMapper.insert(admin);
        ac.close();
    }

    @Test
    public void testDeleteById() {
        Long id = 5L;
        int rows = adminMapper.deleteById(id);
        System.out.println(rows == 1 ? "删除成功" : "删除失败,尝试删除的数据(id=" + id + ") 不存在!");
    }

    @Test
    public void testUpdatePasswordById() {
        Long id = 6L;
        String password = "12ewre";
        int rows = adminMapper.updatePasswordById(id, password);
        System.out.println(rows == 1 ? "修改密码成功" : "修改密码失败，尝试访问数据(id= " + id + ")不存在!");
    }

    // 测试 @sql 注解
    @Test
    @Sql(scripts = {"classpath:truncate.sql", "classpath:insert_data.sql"})
    @Sql(scripts = {"classpath:truncate.sql"}, executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void testDeleteByIdSuccessfully() {
        Long id = 8L;
        int rows = adminMapper.deleteById(id);
        Assertions.assertEquals(1, rows);

    }

    @Test
    public void testCount() {
        System.out.println(adminMapper.count());
    }

    @Test
    public void testGetById() {
        System.out.println(adminMapper.getById(1L));
    }

    @Test
    public void testList() {
        adminMapper.list().forEach(System.out::println);
    }

    @Test
    public void testDeleteByIds() {
        System.out.println(adminMapper.deleteByIds(new long[]{1, 2, 3}));
    }

    @Test
    public void testGetDetailsById() {
        System.out.println(adminMapper.getDetailsById(2L));
    }
}
