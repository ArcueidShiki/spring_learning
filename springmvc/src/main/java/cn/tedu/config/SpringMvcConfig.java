package cn.tedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"cn.tedu.controller","cn.tedu.config"})
@EnableWebMvc // 开启json可以转成对象的功能
public class SpringMvcConfig {
}
