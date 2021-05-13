package cn.liumouren.example.seata.order.feign;

import cn.liumouren.example.common.entity.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author Daniel Liu
 */
@FeignClient(name = "seata-client-storage", path = "/storage")
public interface StorageClient {
    @PutMapping("/{id}/{count}")
    public R reduceInventory(@PathVariable("id") String id, @PathVariable("count") int count);
}
