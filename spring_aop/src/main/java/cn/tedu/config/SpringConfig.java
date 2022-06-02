package cn.tedu.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("cn.tedu")
@PropertySource({"classpath:jdbc.properties"})
@EnableAspectJAutoProxy // 告诉spring有用注解开发的aop
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
