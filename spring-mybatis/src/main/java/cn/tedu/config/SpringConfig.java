package cn.tedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("cn.tedu") //扫包
@PropertySource({"jdbc.properties"}) // 导入配置文件数组
@Import({JdbcConfig.class,MybatisConfig.class}) //导入其他配置类数组
public class SpringConfig {
}
