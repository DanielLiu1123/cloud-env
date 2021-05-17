package cn.liumouren.example.service02.feign.fallback;

import cn.liumouren.example.service02.feign.Service01Client;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Daniel Liu
 */
public class Fallback implements Service01Client {
    @Override
    public String provide(@PathVariable("name") String name) {
        return "provide fallback...";
    }
}
