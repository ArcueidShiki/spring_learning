package cn.tedu.mybatis;

import cn.tedu.mybatis.mappers.EmpMapper;
import cn.tedu.mybatis.pojo.Emp;
import cn.tedu.mybatis.pojo.EmpExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageHelperTest {

    @Test
    public void testPageHelper() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            //开启分页功能  显示第几页，每页显示多少条
//            Page<Object> page = PageHelper.startPage(2, 5);
//            System.out.println("page = " + page);
            PageHelper.startPage(9, 5);
            List<Emp> emps = mapper.selectByExample(null);
            // 导航分页展示的个数
            PageInfo<Emp> page = new PageInfo<>(emps, 5);
            System.out.println(page);// 可以输出关于分页的所有相关信息包括多少导航分页
            emps.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
