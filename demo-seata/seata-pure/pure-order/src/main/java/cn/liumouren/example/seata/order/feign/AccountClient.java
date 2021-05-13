package cn.liumouren.example.seata.order.feign;

import cn.liumouren.example.common.entity.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author Daniel Liu
 */
@FeignClient(name = "seata-client-account", path = "/account")
public interface AccountClient {

    @PutMapping("/{userId}/{money}")
    public R reduceInventory(@PathVariable("userId") String userId, @PathVariable("money") double money);
}
