package cn.tedu.dao;

import cn.tedu.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface UserDao {
    @Insert("insert into user values(null,#{name},#{password},#{nickname})")
    Integer save(User user);
    @Update("update user set name=#{name},password=#{password},nickname=#{nickname} where id=#{id} ")
    Integer update(User user);
    @Delete("delete from user where id=#{id}")
    Integer delete(Integer id);
    @Select("select * from user where id=#{id}")
    User getById(Integer id);
    @Select("select * from user")
    List<User>  getAll();
}
