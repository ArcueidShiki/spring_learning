package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * 通过分布查询员工以及员工所对应的部门
     * 第二步 dept_id查部门
     */

    Dept getEmpAndDeptStepTwo(@Param("did") Integer did);

    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);


    /**
     * 部门中所有员工信息
     */
    Dept getDeptAndEmp(@Param("did") Integer did);


}
