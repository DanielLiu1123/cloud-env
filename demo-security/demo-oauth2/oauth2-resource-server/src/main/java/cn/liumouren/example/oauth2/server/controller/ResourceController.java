package cn.liumouren.example.oauth2.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author daniel liu
 */
@RestController
public class ResourceController {

    @GetMapping("/public/{info}")
    public String publicResource(@PathVariable String info, Principal principal) {
        System.out.println(principal);
        return "Public information : " + info;
    }

    @GetMapping("/private/{info}")
    public String privateResource(@PathVariable String info, Principal principal) {
        System.out.println(principal);
        return "Private information : " + info;
    }

    @GetMapping(value = "/private/read/{info}")
    public String privateRead(@PathVariable String info, Principal principal) {
        System.out.println(principal);
        return "Private read : " + info;
    }

    @GetMapping("/private/write/{info}")
    public String privateWrite(@PathVariable String info, Principal principal) {
        System.out.println(principal);
        return "Private write : " + info;
    }

}
