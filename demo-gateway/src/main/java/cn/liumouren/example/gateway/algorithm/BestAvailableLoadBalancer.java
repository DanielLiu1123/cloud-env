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
import java.util.Map;

/**
 * TODO 待实现... 或者说loadbalancer现在还实现不了....
 *
 * @author Daniel Liu
 */
public class BestAvailableLoadBalancer extends BaseAlgorithmLoadBalancer {
    private static final Log log = LogFactory.getLog(BestAvailableLoadBalancer.class);

    public BestAvailableLoadBalancer(ObjectProvider<ServiceInstanceListSupplier> serviceInstanceListSupplierProvider, String serviceId) {
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

        for (ServiceInstance instance : instances) {
            Map<String, String> metadata = instance.getMetadata();
            System.out.println(metadata);
        }

        return new DefaultResponse(instances.get(0));
    }

}
