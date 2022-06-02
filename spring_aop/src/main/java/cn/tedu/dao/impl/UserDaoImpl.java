package cn.tedu.dao.impl;

import cn.tedu.dao.UserDao;
import cn.tedu.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserDaoImpl implements UserDao {
    @Override
    public int select(int id, String name) {
        return 0;
    }


    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
