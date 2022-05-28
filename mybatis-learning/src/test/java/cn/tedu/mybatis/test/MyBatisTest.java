package cn.tedu.mybatis.test;

import cn.tedu.mybatis.mappers.UserMapper;
import cn.tedu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class MyBatisTest {

    @Test
    public  void testMyBatis() throws IOException {
        // 加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        SqlSession sqlSession  = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int result = mapper.insertUser();
        mapper.updateUser();
        mapper.deleteUser();
        User user = mapper.getUserById();

        System.out.println(user);

        mapper.getAllUser().forEach(System.out::println);
//        sqlSession.commit(); // 可以设置自动提交
//        System.out.println("result = " + result);


    }
}
