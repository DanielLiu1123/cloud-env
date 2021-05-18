package cn.liumouren.example.security.pure.service;

import cn.liumouren.example.security.pure.dao.UserDao;
import cn.liumouren.example.security.pure.entity.User;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Daniel Liu
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        if (!StringUtils.hasText(s)) {
            throw new IllegalArgumentException("user must not empty");
        }
        User user = userDao.selectOne(Wrappers.lambdaQuery(User.class).eq(User::getUsername, s));
        if (user == null) {
            // 不能 return null
            throw new UsernameNotFoundException("username not found");
        }
        String[] authorities = user.getAuthorities().split(",");
        Set<GrantedAuthority> set = new HashSet<>();
        for (String authority : authorities) {
            set.add(new SimpleGrantedAuthority(authority));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), set);
    }
}
