package cn.tedu.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {

    @Insert("insert into log(log) values(#{info})")
    void log(String info);
}
