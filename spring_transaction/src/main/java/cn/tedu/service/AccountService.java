package cn.tedu.service;


import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {
    /**
     * 转账操作
     * @param out 传出方
     * @param in  转入方
     * @param money 金额
     */
    @Transactional(rollbackFor = {IOException.class}) //开启事务
    public void transfer(String out,String in,Double money);
}
