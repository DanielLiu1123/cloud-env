package cn.liumouren.example.gateway.loadbalancer;

import cn.liumouren.example.gateway.algorithm.WeightLoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 * 切换loadbalancer算法
 * 默认为轮询
 * 不要用 @Configuration 注解 !!!
 *
 * @author Daniel Liu
 */
public class CustomLoadBalancerConfiguration {
    @Bean
    ReactorLoadBalancer<ServiceInstance> randomLoadBalancer(Environment environment,
                                                            LoadBalancerClientFactory loadBalancerClientFactory) {
        // 按照权重负载均衡
        String name = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
        return new WeightLoadBalancer(loadBalancerClientFactory
                .getLazyProvider(name, ServiceInstanceListSupplier.class),
                name);
    }
}
