package cn.liumouren.example.security.pure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author daniel liu
 */
@SpringBootApplication
@MapperScan("cn.liumouren.example.security.pure.dao")
public class SecurityPureApp {
    public static void main(String[] args) {
        SpringApplication.run(SecurityPureApp.class, args);
    }
}
