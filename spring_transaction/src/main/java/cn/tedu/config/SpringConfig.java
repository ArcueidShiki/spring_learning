package cn.tedu.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource({"classpath:jdbc.properties"})
@ComponentScan("cn.tedu")
@EnableAspectJAutoProxy
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement // 开启事务
public class SpringConfig {
}
