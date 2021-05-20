package cn.liumouren.example.service02.controller;

import cn.liumouren.example.service02.feign.Service01Client;
import cn.liumouren.example.service02.feign.Service03Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Daniel Liu
 */
@RestController
@RequestMapping("/serviceTwo")
public class ServiceController {
    @Autowired
    private Service01Client service01Client;
    @Autowired
    private Service03Client service03Client;
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping
    public String get() {
        return "service-02";
    }

    @GetMapping("/01/{name}")
    public String feign01(@PathVariable String name) {
        return service01Client.provide(name);
    }

    @GetMapping("/03/{name}")
    public String feign03(@PathVariable String name) {
        return service03Client.provide(name);
    }

    @GetMapping("/clients")
    public Object clients() {
        List<ServiceInstance> instances = discoveryClient.getInstances("service-one");
        return instances;
    }

}
