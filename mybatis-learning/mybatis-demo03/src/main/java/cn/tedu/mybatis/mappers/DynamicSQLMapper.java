package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 多条件查询
     */

    List<Emp> getEmpByConditionOne(Emp emp);

    List<Emp> getEmpByConditionTwo(Emp emp);

    List<Emp> getEmpByConditionTrim(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 通过数组 批量删除
     * 通过集合 批量添加
     */

    int deleteMoreByArray(@Param("eids") Integer[] eids);

    int insertMoreByList(@Param("emps") List<Emp> emps);

}
