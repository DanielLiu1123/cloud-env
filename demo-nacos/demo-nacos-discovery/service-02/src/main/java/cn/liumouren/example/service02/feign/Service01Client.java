package cn.liumouren.example.service02.feign;

import cn.liumouren.example.service02.feign.fallback.Fallback;
import cn.liumouren.example.service02.feign.fallback.FallbackConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 不再支持hystrix,ribbon
 * 因此 熔断器选择 sentinel
 * 负载均衡策略选择 loadbalancer
 *
 * @author Daniel Liu
 */
@FeignClient(name = "service-one",
        configuration = FallbackConfig.class,
        fallback = Fallback.class,
        path = "/serviceOne")
public interface Service01Client {

    /**
     * 注意要写 @PathVariable("name") 不能直接写@PathVariable
     *
     * @param name name
     * @return string
     */
    @GetMapping("/provide/{name}")
    public String provide(@PathVariable("name") String name);
}
