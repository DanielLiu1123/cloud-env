package cn.liumouren.example.oauth2.client.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.approval.ApprovalStore;
import org.springframework.security.oauth2.provider.approval.JdbcApprovalStore;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * @author daniel liu
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private DataSource dataSource;

    /**
     * 授权码模式专用对象
     */
    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * token保存策略
     */
    @Bean
    public TokenStore tokenStore() {
        return new JdbcTokenStore(dataSource);
    }

    /**
     * 客户端信息来源
     */
    @Bean
    public ClientDetailsService customClientDetailsService() {
        return new JdbcClientDetailsService(dataSource);
    }

    /**
     * 授权信息保存策略
     */
    @Bean
    public ApprovalStore approvalStore() {
        return new JdbcApprovalStore(dataSource);
    }

    /**
     * 授权码模式数据来源
     */
    @Bean
    public AuthorizationCodeServices authorizationCodeServices() {
        return new JdbcAuthorizationCodeServices(dataSource);
    }


    // http://localhost:9000/oauth/authorize?&response_type=code&client_id=client01
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // 指定客户端信息数据来源
        clients.withClientDetails(customClientDetailsService());
    }

    /**
     * [{"timestamp":"2021-01-08T05:56:40.950+0000","status":403,"error":"Forbidden","message":"Forbidden","path":"/oauth/check_token"}]
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) {
        // 检查token策略
        oauthServer
                .checkTokenAccess("isAuthenticated()")
                .allowFormAuthenticationForClients();
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
        // Oauth2主配置信息
        endpoints
                .tokenStore(tokenStore())
                .approvalStore(approvalStore())
                .authorizationCodeServices(authorizationCodeServices())
                .authenticationManager(authenticationManager);
    }

}