package cn.liumouren.example.service02;

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
public class Service02App {
    public static void main(String[] args) {
        SpringApplication.run(Service02App.class, args);
    }
}
