package cn.tedu.service;

import cn.tedu.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface UserService {
    /**
     * 保存
     * @param user
     * @return
     */
    boolean save(User user);

    /**
     * 修改
     * @param user
     * @return
     */
    boolean update(User user);

    /**
     * 按id删除
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<User> getAll();
}
