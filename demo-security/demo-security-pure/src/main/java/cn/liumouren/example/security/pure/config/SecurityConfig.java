package cn.liumouren.example.security.pure.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Daniel Liu
 */
@EnableWebSecurity
// 开启注解
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // 授权请求
                .authorizeRequests(e -> e
//                        .antMatchers("/admin/**").authenticated()
                        .anyRequest().permitAll())
                // 使用自定义登陆配置
//                .formLogin(f -> f
//                        .loginPage("/login.html")
//                        .loginProcessingUrl("/login")
//                        .usernameParameter("username")
//                        .passwordParameter("password")
//                        .failureForwardUrl("/login.html"))
//                        .successForwardUrl("/index")  // 需要post请求
                // 使用默认登录配置
                .formLogin(Customizer.withDefaults())
                // 默认登出配置
                .logout(Customizer.withDefaults())
                // rememberMe for 7days
                .rememberMe(r -> r.tokenValiditySeconds(60 * 60 * 24 * 7))
                // 关闭csrf防护
                .csrf(AbstractHttpConfigurer::disable);

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

}
