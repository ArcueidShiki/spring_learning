package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    /**
     * 缓存只对查询功能有效
     */
    Emp getEmpById(@Param("eid") Integer id);
}
