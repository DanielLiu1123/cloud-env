package cn.liumouren.example.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniel Liu
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${dev.name}")
    private String name;

    @GetMapping
    public String get() {
        return name;
    }

}
