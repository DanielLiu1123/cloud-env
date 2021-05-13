package cn.liumouren.example.seata.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.liumouren.example.seata.order.entity.Order;

/**
 * (Order)表服务接口
 *
 * @author daniel liu
 */
public interface OrderService extends IService<Order> {

    public void order(Order order);

}
