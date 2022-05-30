package cn.tedu.mybatis.test;

import cn.tedu.mybatis.mappers.DynamicSQLMapper;
import cn.tedu.mybatis.pojo.Emp;
import cn.tedu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DynamicSQLMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp();
        emp.setJob("销售");
        mapper.getEmpByConditionOne(emp).forEach(System.out::println);
        mapper.getEmpByConditionTwo(emp).forEach(System.out::println);
        mapper.getEmpByChoose(emp).forEach(System.out::println);


    }

    @Test
    public void testDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        mapper.deleteMoreByArray(new Integer[]{41,42,43});
    }

    @Test
    public void testInsertMoreByList(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(null,"爱尔奎特","吸血鬼"));
        list.add(new Emp(null,"希耶尔","代行者"));
        mapper.insertMoreByList(list);
    }
}
