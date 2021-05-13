package cn.liumouren.example.sentinel.controller;

import cn.liumouren.example.sentinel.handler.BlockHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniel Liu
 */
@RestController
public class SentinelController {

    // ==================================================
    // 不做降级处理
    // ==================================================

    @GetMapping("/a")
    public String a() {
        return "aaaaaaaaaa";
    }

    // ==================================================
    // 自定义降级处理
    // ==================================================

    @GetMapping("/b")
    @SentinelResource(value = "b", blockHandlerClass = BlockHandler.class, blockHandler = "handlerException")
    public String b() {
        return "bbbbbbbbb";
    }

    // ==================================================
    // 持久化规则到nacos
    // ==================================================

    @GetMapping("/c")
    @SentinelResource(value = "c", blockHandlerClass = BlockHandler.class, blockHandler = "handlerException")
    public String c() {
        return "ccccccccc";
    }

}
