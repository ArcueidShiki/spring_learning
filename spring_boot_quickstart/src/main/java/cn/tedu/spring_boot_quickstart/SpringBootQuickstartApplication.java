package cn.tedu.spring_boot_quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //把所在的包及其子包全部扫描一边
public class SpringBootQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuickstartApplication.class, args);
    }

}
