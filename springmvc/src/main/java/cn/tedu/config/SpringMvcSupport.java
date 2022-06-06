package cn.tedu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Override //添加资源过滤
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当访问时，不要走mvc,走指定目录下的内容
        // 当进行这个路径下的所有这种操作时，走以下这种路径
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }
}
