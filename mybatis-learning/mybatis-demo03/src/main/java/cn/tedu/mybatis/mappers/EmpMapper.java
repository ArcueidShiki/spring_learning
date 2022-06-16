package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    /**
     * 查询所有员工信息
     */
    List<Emp> getAllEmp();

    /**
     * 查询员工对应的部门信息
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);

    /**
     * \
     * 通过分布查询员工以及员工所对应的部门
     * 第一步
     */
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
}
