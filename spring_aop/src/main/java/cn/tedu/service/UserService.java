package cn.tedu.service;

import cn.tedu.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserService {
    User findById(Integer id);

    List<User> findAll();

    void save(User user);

    void delete(Integer id);

    void update(User user);

    public int select(int id,String x);
}
