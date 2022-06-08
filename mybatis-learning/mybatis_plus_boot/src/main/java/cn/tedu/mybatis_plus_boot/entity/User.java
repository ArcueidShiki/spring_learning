package cn.tedu.mybatis_plus_boot.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data //但不包含构造方法的注解
//@TableName("user")
public class User {
//    @TableId(type = IdType.ASSIGN_ID) //修改id自增策略  在yml文件配置
    private Long id;
    private String name;
    @TableField(value = "password",select = false)
    private String password;
    private String nickname;
    @TableField(exist = false)
    private Integer online;

    //逻辑删除字段 标记当前记录是否被删除
//    @TableLogic(value = "0",delval = "1")
    private Integer deleted;

    //用来实现乐观锁
    @Version
    private Integer version;
    // update set abc = 1,version=version+1 where version=1 通过拦截器添加 在修改之前要收集到version的值 通过select
}
