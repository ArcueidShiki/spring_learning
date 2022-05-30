package cn.tedu.mybatis.test;

import cn.tedu.mybatis.mappers.CacheMapper;
import cn.tedu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CacheMapperTest {
    @Test
    public void testCacheMapper(){
        SqlSession sqlSession1 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        System.out.println(mapper1.getEmpById(1));

        /*
        一级缓存sqlSession级别 默认开启
        二级缓存是 SqlSessionFactory级别:通过同一个factory创建的session 会被缓存
        cacheEnabled=true,默认为true 二级缓存必须在sqlSession关闭或提交后有效
        */
        CacheMapper mapper2 = sqlSession1.getMapper(CacheMapper.class);
        System.out.println(mapper2.getEmpById(1));

        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper3 = sqlSession2.getMapper(CacheMapper.class);
        System.out.println(mapper3.getEmpById(1));
        /**
         * 一级缓存的四种情况
         * 不同session,查询条件不同,两次查询间进行增删改操作,手动情况缓存
         */

    }

    @Test
    public void testLevelTwoCache(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            System.out.println(mapper1.getEmpById(1));
            sqlSession1.close();
            // Cache Hit Ratio 缓存命中率 0.5 clearCache既会清空一级也会情况二级
            SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            System.out.println(mapper2.getEmpById(1));
            sqlSession2.commit();  // 用commit 而非close不会warning
            // Cache Hit Ratio 缓存命中率 2/3
            SqlSession sqlSession3 = sqlSessionFactory.openSession(true);
            CacheMapper mapper3 = sqlSession3.getMapper(CacheMapper.class);
            System.out.println(mapper3.getEmpById(1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
