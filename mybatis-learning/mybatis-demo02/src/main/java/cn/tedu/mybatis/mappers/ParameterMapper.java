package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    List<User> getAllUser();

    User GetUserByUsername(String username);

    User checkLogin(String username,String password);

    User checkLoginByMap(Map<String,Object> map);
    // 根据属性赋值。什么是属性:有getter和setter
    int insertUser(User user);

    //@param 来命名参数

    User checkLoginByParam(@Param("username") String username,
                           @Param("password") String password);
}
