package cn.tedu.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
@TableName("user")
public class Emp {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.id
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.name
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.job
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.manager
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    private Integer manager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.hiredate
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    private Date hiredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sal
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    private Double sal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.comm
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    private Double comm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.dept_id
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    private Integer deptId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.id
     *
     * @return the value of emp.id
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.id
     *
     * @param id the value for emp.id
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.name
     *
     * @return the value of emp.name
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.name
     *
     * @param name the value for emp.name
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.job
     *
     * @return the value of emp.job
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.job
     *
     * @param job the value for emp.job
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.manager
     *
     * @return the value of emp.manager
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public Integer getManager() {
        return manager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.manager
     *
     * @param manager the value for emp.manager
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public void setManager(Integer manager) {
        this.manager = manager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.hiredate
     *
     * @return the value of emp.hiredate
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.hiredate
     *
     * @param hiredate the value for emp.hiredate
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sal
     *
     * @return the value of emp.sal
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public Double getSal() {
        return sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sal
     *
     * @param sal the value for emp.sal
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public void setSal(Double sal) {
        this.sal = sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.comm
     *
     * @return the value of emp.comm
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public Double getComm() {
        return comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.comm
     *
     * @param comm the value for emp.comm
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public void setComm(Double comm) {
        this.comm = comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.dept_id
     *
     * @return the value of emp.dept_id
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.dept_id
     *
     * @param deptId the value for emp.dept_id
     *
     * @mbg.generated Mon May 30 17:27:44 CST 2022
     */
    public void setDeptId(Integer deptId) {

        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", manager=" + manager +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptId=" + deptId +
                '}';
    }
}