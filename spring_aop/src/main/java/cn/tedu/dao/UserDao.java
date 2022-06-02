package cn.tedu.dao;

import cn.tedu.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface UserDao {
    int select(int id,String name);
    @Insert("insert into user(name,password) values(#{name},#{password})")
    void save(User user);
    @Update("update user set name=#{name},password=#{password} where id=#{id}")
    void update(User user);
    @Delete("delete from user where id=#{id}")
    void delete(Integer id);
    @Select("select id,name,password from user where id=#{id}")
    User findById(Integer id);
    @Select("select id,name,password from user")
    List<User> findAll();
}
