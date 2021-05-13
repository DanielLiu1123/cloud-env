package cn.liumouren.example.seata.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author daniel
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.liumouren.example.seata.storage.dao")
public class SeataShardingStorageApp {
    public static void main(String[] args) {
        SpringApplication.run(SeataShardingStorageApp.class, args);
    }
}
