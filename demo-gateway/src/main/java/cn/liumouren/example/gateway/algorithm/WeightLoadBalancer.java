package cn.liumouren.example.gateway.algorithm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.DefaultResponse;
import org.springframework.cloud.client.loadbalancer.EmptyResponse;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 通过配置权重选择
 * <p>通过spring.cloud.nacos.discovery.weight配置权重
 *
 * @author Daniel Liu
 */
public class WeightLoadBalancer extends BaseAlgorithmLoadBalancer {
    private static final Log log = LogFactory.getLog(WeightLoadBalancer.class);

    public WeightLoadBalancer(ObjectProvider<ServiceInstanceListSupplier> serviceInstanceListSupplierProvider, String serviceId) {
        super(serviceInstanceListSupplierProvider, serviceId);
    }

    @Override
    public Response<ServiceInstance> choose(List<ServiceInstance> instances) {
        if (instances.isEmpty()) {
            if (log.isWarnEnabled()) {
                log.warn("No servers available for service: " + getServiceId());
            }
            return new EmptyResponse();
        }

        float[] weights = new float[instances.size()];
        float total = 0.0f;
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Float.parseFloat(instances.get(i).getMetadata().get("nacos.weight"));
            total += weights[i];
        }

        // 随机一个 0-total 的数
        float value = ThreadLocalRandom.current().nextFloat() * total;
        float sum = 0.0f;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if (value < sum) {
                return new DefaultResponse(instances.get(i));
            }
        }

        return new DefaultResponse(instances.get(weights.length - 1));
    }
}
