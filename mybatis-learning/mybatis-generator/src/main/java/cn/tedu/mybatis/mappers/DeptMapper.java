package cn.tedu.mybatis.mappers;

import cn.tedu.mybatis.pojo.Dept;
import cn.tedu.mybatis.pojo.DeptExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    long countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int insert(Dept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int insertSelective(Dept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    Dept selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int updateByExampleSelective(@Param("row") Dept row, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int updateByExample(@Param("row") Dept row, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int updateByPrimaryKeySelective(Dept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Mon May 30 13:57:06 CST 2022
     */
    int updateByPrimaryKey(Dept row);
}