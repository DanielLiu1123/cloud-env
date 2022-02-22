package cn.liumouren.example.seata.account.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.liumouren.example.seata.account.dao.AccountDao;
import cn.liumouren.example.seata.account.entity.Account;
import cn.liumouren.example.seata.account.service.AccountService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * (Account)表服务实现类
 *
 * @author daniel liu
 */
@Service("accountService")
public class AccountServiceImpl extends ServiceImpl<AccountDao, Account> implements AccountService {

    @Override
    public void deductMoney(String userId, double money) {
        super.update(new LambdaUpdateWrapper<Account>()
                .eq(Account::getUserId, userId)
                .setSql("`money` = `money` - " + money));
        // mock exception
        int i = 1 / 0;
    }

}
