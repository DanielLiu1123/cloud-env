package cn.liumouren.example.oauth2.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


/**
 * @author daniel liu
 */
@SpringBootApplication
public class Oauth2AuthorizationServerApp {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2AuthorizationServerApp.class, args);
    }
}
