package cn.tedu.mybatis.mapper;

import cn.tedu.mybatis.pojo.Admin;
import cn.tedu.mybatis.vo.AdminDetailsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AdminMapper {

    int insert(Admin admin);
    //方法参数只有一个时，不用添加@param，因为mybatis可以直接找到这个参数
    int deleteById(Long id);

    int updatePasswordById(@Param("id") Long id,
                           @Param("password") String password);

    //查询 单条用find get, 多条 list
    int count();

    Admin getById(Long id);

    List<Admin> list();

    int deleteByIds(Long...ids);

//    int deleteByIds(Long[] ids);
    int deleteByIds(List<Long> ids);

    int deleteByIds(long[] longs);

    AdminDetailsVO getDetailsById(Long id);
}
