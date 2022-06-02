package cn.tedu.service.impl;

import cn.tedu.dao.AccountDao;
import cn.tedu.service.AccountService;
import cn.tedu.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    //装配日志
    @Autowired
    private LogService logService;

    public void transfer(String out, String in, Double money) {
        try{
            accountDao.outMoney(out,money);
//        int i = 1/0; // 由于开启事务，两个操作 同成功同失败，一旦出错rollback事务
//        if(true){throw new IOException();}
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);//一定运行的代码放在finally中
        }
    }
}
