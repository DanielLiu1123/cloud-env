package cn.liumouren.example.seata.order.service.impl;

import cn.liumouren.example.common.entity.R;
import cn.liumouren.example.seata.order.dao.OrderDao;
import cn.liumouren.example.seata.order.entity.Order;
import cn.liumouren.example.seata.order.feign.AccountClient;
import cn.liumouren.example.seata.order.feign.StorageClient;
import cn.liumouren.example.seata.order.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(rollbackFor = Exception.class)
    @ShardingTransactionType(TransactionType.BASE)
    public void order(Order order) {
        // 新订单
        save(order);

        // 减库存
        R r = storageClient.reduceInventory(order.getCommodityCode(), order.getCount());
        System.out.println(r);

        // 模拟异常
        if (Integer.parseInt(order.getCommodityCode()) % 5 == 0) {
            throw new RuntimeException("err...");
        }
    }

}
