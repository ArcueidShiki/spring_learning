package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 多条件查询
     */

    List<Emp> getEmpByCondition(Emp emp);
    List<Emp> getEmpByConditionTwo(Emp emp);
}
