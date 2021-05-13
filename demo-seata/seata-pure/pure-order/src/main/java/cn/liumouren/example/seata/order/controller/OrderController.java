package cn.liumouren.example.seata.order.controller;


import cn.liumouren.example.common.entity.R;
import cn.liumouren.example.seata.order.entity.Order;
import cn.liumouren.example.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Order)表控制层
 *
 * @author daniel liu
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public R order(Order order) {
        orderService.order(order);
        return R.ok("ok");
    }
}
