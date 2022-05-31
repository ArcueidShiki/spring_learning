package cn.tedu.mybatis.mapper;

import cn.tedu.mybatis.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {

    int insert(Admin admin);
    //方法参数只有一个时，不用添加@param，因为mybatis可以直接找到这个参数
    int deleteById(Long id);

    int updatePasswordById(@Param("id") Long id,
                           @Param("password") String password);
}
