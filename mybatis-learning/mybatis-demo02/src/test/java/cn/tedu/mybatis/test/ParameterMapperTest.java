package cn.tedu.mybatis.test;

import cn.tedu.mybatis.mappers.ParameterMapper;
import cn.tedu.mybatis.pojo.User;
import cn.tedu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class ParameterMapperTest {
    /**
     * mybatis 获取参数：
     * ${} 本质 字符串拼接
     * #{} 本质 占位符赋值
     *
     * mybatis获取参数值的各种情况:
     * 多个参数 : #{arg0}  #{arg1}
     *           #{param1} #{param2}
     *
     *
     */

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        mapper.getAllUser().forEach(System.out::println);
    }

    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.GetUserByUsername("Arcueid"));
    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.checkLogin("Arcueid", "123"));
    }

    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","Arcueid"); // 自定义键
        map.put("password","123");
        System.out.println(mapper.checkLoginByMap(map));
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.insertUser(new User("冲田中司", "123", "okita")));
    }

    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.checkLoginByParam("Arcueid", "123"));

    }
    @Test
    public void testJDBC() throws Exception{
        String username ="admin";
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
//        connection.prepareStatement("select * from user where username ='"+username+"'"); //会造成sql注入
        PreparedStatement ps = connection.prepareStatement("select * from user where name =?");
        ps.setString(1,username); // 占位符 避免sql注入

    }

}
