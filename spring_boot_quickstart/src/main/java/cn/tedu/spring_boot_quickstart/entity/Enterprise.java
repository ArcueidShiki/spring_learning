package cn.tedu.spring_boot_quickstart.entity;

import cn.tedu.spring_boot_quickstart.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ConfigurationProperties(prefix = "enterprise")
public class Enterprise {
    private String name;
    private String[] jobs;

    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", jobs=" + Arrays.toString(jobs) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getJobs() {
        return jobs;
    }

    public void setJobs(String[] jobs) {
        this.jobs = jobs;
    }
}
