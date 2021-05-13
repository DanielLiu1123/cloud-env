package cn.liumouren.example.seata.account.controller;


import cn.liumouren.example.common.entity.R;
import cn.liumouren.example.seata.account.service.AccountService;
import cn.liumouren.example.seata.account.entity.Account;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (Account)表控制层
 *
 * @author daniel liu
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PutMapping("/{userId}/{money}")
    public R reduceInventory(@PathVariable String userId, @PathVariable double money) {
        accountService.deductMoney(userId, money);
        return R.ok("ok");
    }


}
