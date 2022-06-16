package cn.tedu.mybatis_plus_boot;

import cn.tedu.mybatis_plus_boot.dao.UserDao;
import cn.tedu.mybatis_plus_boot.entity.User;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlusBootApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        userDao.selectList(null).forEach(System.out::println);
    }

    @Test
    void testUpdateOne() {
        User user = new User();
        user.setId(1L);
        user.setName("爱尔奎特");
        userDao.updateById(user);
    }

    @Test
    void testGetByPage() {
        //需要开启MP分页拦截器
        IPage page = new Page(2, 5);
        userDao.selectPage(page, null);
        System.out.println("当前第几页:" + page.getCurrent());
        System.out.println("每页多少条:" + page.getSize());
        System.out.println("一共多少页:" + page.getPages());
        System.out.println("一共多少条:" + page.getTotal());
        System.out.println("页面数据:");
        page.getRecords().forEach(System.out::println);
    }


    @Test
    void testGetByConditions() {
        // 设置一 按条件查询
//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.lt("id",18); // id 小于18
        // 设置二 lambda格式按条件查询
//        QueryWrapper<User> wrapper = new QueryWrapper<User>();
//        wrapper.lambda().lt(User::getId,10); // id 小于10

        // 设置三 lambda格式按条件查询
//        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
//        wrapper.lt(User::getId,20); //lt 小于 less than
//        wrapper.gt(User::getId,10); // gt 大于 great than
        // 也可以链式写法 属于是and关系 加Or()的关系
//        wrapper.select(User::getId,User::getName);
//        wrapper.lt(User::getId,10).or().gt(User::getId,30);
//        userDao.selectList(wrapper).forEach(System.out::println);

//        QueryWrapper<User> wrapper = new QueryWrapper<>();
        // 查询count(*)
//        wrapper.select("count(*) as count,password");
//        wrapper.groupBy("password");
//        List<Map<String,Object>> userList = userDao.selectMaps(wrapper);
//        System.out.println(userList);

        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        // 等同于
        wrapper.eq(User::getName, "青子").eq(User::getPassword, "123");
        System.out.println(userDao.selectOne(wrapper));
        //范围查询 lt gt le ge eq between
    }


    @Test
    void testSave() {
        User user = new User();
        user.setName("llllll");
        user.setPassword("123123");
        user.setNickname("ascFAsd");
        userDao.insert(user);
    }

    // 同时删除多条（ids）购物车 同时删除
    @Test
    void testDeleteBatch() {
        List<Long> list = new ArrayList<>();
        list.add(1534548961101815809L);
        list.add(1534548920790310913L);
        list.add(1534547239646253058L);
        userDao.deleteBatchIds(list);
    }

    // 根据id查多条 显示购物车
    @Test
    void testSelectBatch() {
        List<Long> list = new ArrayList<>();
        list.add(15L);
        list.add(36L);
        list.add(42L);
        userDao.selectBatchIds(list);
    }

    @Test
    void testDeleteLogic() {
        userDao.deleteById(3);
    }

    @Test
        // 测试乐观锁 version
    void testUpdateVersion() {
        User user = userDao.selectById(11L);
        user.setName("jiamo");
        userDao.updateById(user);
    }
}
