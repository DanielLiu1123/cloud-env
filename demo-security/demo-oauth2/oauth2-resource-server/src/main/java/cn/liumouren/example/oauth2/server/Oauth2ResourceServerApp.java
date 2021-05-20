package cn.liumouren.example.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author daniel liu
 */
@SpringBootApplication
public class Oauth2ResourceServerApp {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2ResourceServerApp.class, args);
    }
}
