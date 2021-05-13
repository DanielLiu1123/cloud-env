package cn.liumouren.example.gateway.loadbalancer;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.context.annotation.Configuration;

/**
 * 给服务自定义负载均衡策略
 * service-one使用 CustomLoadBalancerConfiguration策略
 * 其他服务使用默认策略
 *
 * @author Daniel Liu
 */
@Configuration(proxyBeanMethods = false)
@LoadBalancerClients(defaultConfiguration = CustomLoadBalancerConfiguration.class)
public class LbConfig {

}
