package cn.tedu.service;

import cn.tedu.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserService {
    @Select("select id,name,password from user where id=#{id}")

    User findById(int i);
}
