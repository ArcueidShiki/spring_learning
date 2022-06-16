package cn.tedu.mybatis;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:datasource.properties") // 读取properties文件，将值读取包Spring容器中Environment对象
@MapperScan("cn.tedu.mybatis.mapper") // 扫描所有mapper包中的接口， 或者在mapper接口上分别添加@Mapper
public class SpringConfig {

    @Bean
    public DataSource dataSource(Environment env) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(env.getProperty("datasource.url"));
        dataSource.setDriverClassName(env.getProperty("datasource.driver"));
        dataSource.setUsername(env.getProperty("datasource.username"));
        dataSource.setPassword(env.getProperty("datasource.password"));
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource,
                                                       @Value("${mybatis.mapper-locations}") Resource mapperLocations) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(mapperLocations);
        return sqlSessionFactoryBean;


    }
}
