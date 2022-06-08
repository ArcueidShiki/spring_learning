package cn.tedu.spring_boot_quickstart.controller;

import cn.tedu.spring_boot_quickstart.entity.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${spring.datasource.type}")
    private String datasource;

    @Value("${enterprise.jobs[3]}")
    private String cSharp;
    @Value("${spring.datasource.url}")
    private String url;
    @Autowired
    private Environment environment;

    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("datasource = " + datasource);
        System.out.println("cSharp = " + cSharp);
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println("url = " + url);
        System.out.println(environment.getProperty("logging.level.cn.tedu"));
        System.out.println("enterprise = " + enterprise);
        return "hello , spring boot! ";
    }
    @GetMapping
    public String test(){
        return "Hello spring boot!";
    }

}
