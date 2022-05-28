package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /**
     * 两个一致，
     * 1.映射文件UserMapper.xml 中 namespace与接口中UserMapper的全类名一致
     * 2.映射文件UserMapper.xml 中 SQL语句的id和UserMapper接口中的方法名一致
     */
    int insertUser();

    int deleteUser();

    void updateUser();

    User getUserById();

    List<User> getAllUser();


}
