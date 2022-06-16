package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    /**
     * 根据id查询用户信息
     */
    List<User> getUserById(@Param("id") Integer id);

    /**
     * 查询用户信息的总记录数
     */

    Integer getCount();

    /**
     * 根据id 查询用户信息为一个map集合
     * map集合响应到浏览器 是一个json对象
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户信息转换为map集合
     */
    @MapKey("id")
//设置当前集合的键
    Map<String, Object> getAllUserToMap();
}
