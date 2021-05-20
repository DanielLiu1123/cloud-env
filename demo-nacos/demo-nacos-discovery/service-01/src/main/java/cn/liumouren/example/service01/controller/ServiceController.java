package cn.liumouren.example.service01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.bind.annotation.*;

/**
 * @author Daniel Liu
 */
@RestController
@RequestMapping("/serviceOne")
public class ServiceController {
    @Value("${server.port}")
    private int port;

    @GetMapping
    public String get() {
        return "service-01---->" + port;
    }

    @GetMapping("/provide/{name}")
    public String provide(@PathVariable String name) {
        if ("daniel".equals(name)) {
            int i = 1 / 0;
        }
        return name + "--->" + port;
    }
}
