package cn.tedu.mybatis;

import cn.tedu.mybatis.mappers.EmpMapper;
import cn.tedu.mybatis.pojo.Emp;
import cn.tedu.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MBFTest {

    @Test
    public void testMBG(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//            List<Emp> emps = mapper.selectByExample(null);
//            emps.forEach(System.out::println);
            EmpExample example = new EmpExample();
            example.createCriteria().andNameEqualTo("孙悟空");
            example.or().andNameEqualTo("猪八戒");
            mapper.selectByExample(example).forEach(System.out::println);
            // 直接修改。不修改的字段会被全部置为null
//            mapper.updateByPrimaryKey(new Emp(36,"Arcueid"));
            // 选择修改，修改的字段不会受影响
            mapper.updateByPrimaryKeySelective(new Emp(36,"Arcueid","吸血鬼"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
