package cn.liumouren.example.seata.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author daniel
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("cn.liumouren.example.seata.order.dao")
public class SeataShardingOrderApp {
    public static void main(String[] args) {
        SpringApplication.run(SeataShardingOrderApp.class, args);
    }
}
