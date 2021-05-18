package cn.liumouren.example.security.pure.controller;

import cn.liumouren.example.security.pure.dao.UserDao;
import cn.liumouren.example.security.pure.entity.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Daniel Liu
 */
@RestController
public class SecurityController {

    @Resource
    private UserDao userDao;

    @GetMapping("/admin/{route}")
    @PreAuthorize("hasRole('ADMIN')")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')") // 这样也可以, spring security role默认以 ROLE_ 开头
    public String a(@PathVariable String route) {
        return route;
    }

    @GetMapping("/user/{route}")
    @PreAuthorize("hasRole('USER')")
    public String b(@PathVariable String route) {
        return route;
    }

    @GetMapping("/adduser/{username}/{password}/{roles}")
    @PreAuthorize("'root'.equals(principal.username)")  // 只有root用户可以操作
    public String addUser(@PathVariable String username, @PathVariable String password, @PathVariable String roles) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(new BCryptPasswordEncoder().encode(password));
        user.setAuthorities(roles);
        userDao.insert(user);
        return "add user ok!";
    }

    @PostMapping("/index")
    public String index() {
        return "index";
    }

}
