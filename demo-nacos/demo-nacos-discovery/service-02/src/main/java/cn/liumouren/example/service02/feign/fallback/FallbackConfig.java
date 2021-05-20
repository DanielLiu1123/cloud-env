package cn.liumouren.example.service02.feign.fallback;

import org.springframework.context.annotation.Bean;

/**
 * @author Daniel Liu
 */
public class FallbackConfig {
    @Bean
    public Fallback fallback() {
        return new Fallback();
    }
}
