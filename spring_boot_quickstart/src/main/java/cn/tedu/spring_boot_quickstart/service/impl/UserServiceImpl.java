package cn.tedu.spring_boot_quickstart.service.impl;

import cn.tedu.spring_boot_quickstart.dao.UserDao;
import cn.tedu.spring_boot_quickstart.entity.User;
import cn.tedu.spring_boot_quickstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean save(User user) {
        return userDao.save(user) > 0;
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return userDao.delete(id) > 0;
    }

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
