package cn.tedu.mybatis.test;

import cn.tedu.mybatis.mappers.SQLMapper;
import cn.tedu.mybatis.pojo.User;
import cn.tedu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;

public class SQLMapperTest {
    @Test //模糊查询 使用${} #{}会自动加‘’
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.getUserByLike("Arc"));
    }

    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.deleteMore("31,32,33"));
    }

    @Test
    public void testGetUserByTableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.getUserByTableName("user"));
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User("魔神saber", "123", "泳装总司");
        mapper.insertUser(user);
        System.out.println(user);
    }

    @Test
    public void testJDBC() throws Exception{
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        // 获取自动递增的主键
        PreparedStatement ps = connection.prepareStatement("", Statement.RETURN_GENERATED_KEYS);
        ps.executeUpdate();
        ResultSet resultSet = ps.getGeneratedKeys();;

    }
}
