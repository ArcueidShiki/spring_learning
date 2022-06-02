package cn.tedu.service.impl;

import cn.tedu.dao.UserDao;
import cn.tedu.entity.User;
import cn.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    // Service层转Dao层
    public void save(User user){
        userDao.save(user);
    }

    public void update(User user){
        userDao.update(user);
    }

    @Override
    public int select(int id,String x) {
        return 0;
    }

    public void delete(Integer id){
        userDao.delete(id);
    }

    public User findById(Integer id){
        return userDao.findById(id);
    }


    public List<User> findAll(){
        return userDao.findAll();
    }




}
