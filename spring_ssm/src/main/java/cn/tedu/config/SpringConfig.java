package cn.tedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"cn.tedu.service"})
@PropertySource({"classpath:jdbc.properties"})
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableTransactionManagement // 1.开启注解事务驱动i
public class SpringConfig {
}
