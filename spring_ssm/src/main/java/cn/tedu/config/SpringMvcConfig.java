package cn.tedu.config;

import cn.tedu.controller.interceptor.ProjectInterceptor;
import cn.tedu.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"cn.tedu.controller"/*,"cn.tedu.config"*/})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
    // 不推荐在这里面写拦截器，侵入性强
    @Autowired
    private ProjectInterceptor interceptor;
    @Autowired
    private ProjectInterceptor2 interceptor2;
    @Override //注册拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/users/*","/users");
        registry.addInterceptor(interceptor2).addPathPatterns("/users/*","/users");
    }
}
