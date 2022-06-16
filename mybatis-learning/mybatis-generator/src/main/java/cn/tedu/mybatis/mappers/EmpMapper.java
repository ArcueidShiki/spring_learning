package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.Emp;
import cn.tedu.mybatis.pojo.EmpExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    long countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int insert(Emp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int insertSelective(Emp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    Emp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int updateByExampleSelective(@Param("row") Emp row, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int updateByExample(@Param("row") Emp row, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int updateByPrimaryKeySelective(Emp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int updateByPrimaryKey(Emp row);
}