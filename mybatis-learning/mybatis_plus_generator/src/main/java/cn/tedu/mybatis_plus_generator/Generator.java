package cn.tedu.mybatis_plus_generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

public class Generator {
    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();
        DataSourceConfig dataSource = new DataSourceConfig();
        generator.setDataSource(dataSource);
        generator.execute();
    }
}
