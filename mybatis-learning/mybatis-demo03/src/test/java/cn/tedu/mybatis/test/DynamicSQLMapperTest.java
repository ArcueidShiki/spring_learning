package cn.tedu.mybatis.test;

import cn.tedu.mybatis.mappers.DynamicSQLMapper;
import cn.tedu.mybatis.mappers.EmpMapper;
import cn.tedu.mybatis.pojo.Emp;
import cn.tedu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class DynamicSQLMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp();
        emp.setJob("销售");
        mapper.getEmpByCondition(emp).forEach(System.out::println);

    }
}
