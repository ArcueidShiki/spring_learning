package cn.tedu.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {


    @Bean //做方法让其返回SqlSessionFactory对象,需要把mybatis-config.xml中的配置都在这里面配置了
    // 形参上加 自动装配和依赖注入
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("cn.tedu.entity");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    @Bean // 造Mapper接口的实现类 映射扫描
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("cn.tedu.dao");
        return msc;
    }
}
