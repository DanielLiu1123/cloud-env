package cn.liumouren.example.seata.order.service.impl;

import cn.liumouren.example.common.entity.R;
import cn.liumouren.example.seata.order.feign.AccountClient;
import cn.liumouren.example.seata.order.feign.StorageClient;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.liumouren.example.seata.order.dao.OrderDao;
import cn.liumouren.example.seata.order.entity.Order;
import cn.liumouren.example.seata.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * (Order)表服务实现类
 *
 * @author daniel liu
 */
@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {
    @Autowired
    private StorageClient storageClient;
    @Autowired
    private AccountClient accountClient;

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void order(Order order) {
        // 新订单
        super.save(order);
        // 减库存
        R r = storageClient.reduceInventory(order.getCommodityCode(), order.getCount());
        System.out.println(r);
        // 减余额
        R r1 = accountClient.reduceInventory(order.getUserId(), order.getMoney());
        System.out.println(r1);
    }

}
