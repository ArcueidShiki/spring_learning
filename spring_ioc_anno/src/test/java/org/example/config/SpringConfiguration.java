package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

//可以用核心的配置类替代XML  标记该类是spring的核心配置类
@Configuration
@ComponentScan("org.example")// 配置组件扫描 == <context:component-scan base-package="org.example"/>
@Import({DataSourceConfiguration.class})// <import resource="classpath:"/>
public class SpringConfiguration {



}
