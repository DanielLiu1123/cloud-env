package cn.liumouren.example.seata.account.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.liumouren.example.seata.account.entity.Account;

/**
 * (Account)表服务接口
 *
 * @author daniel liu
 */
public interface AccountService extends IService<Account> {


    public void deductMoney(String userId, double money);

}
