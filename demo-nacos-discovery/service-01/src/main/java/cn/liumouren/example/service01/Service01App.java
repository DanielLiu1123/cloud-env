package cn.liumouren.example.service01;

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
public class Service01App {
    public static void main(String[] args) {
        SpringApplication.run(Service01App.class, args);
    }
}
