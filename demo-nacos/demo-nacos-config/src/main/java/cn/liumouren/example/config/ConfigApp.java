package cn.liumouren.example.config;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.AbstractListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author Daniel Liu
 */
@SpringBootApplication
public class ConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApp.class, args);
    }


    @Configuration
    static class Runner implements ApplicationRunner {
        @Autowired
        private NacosConfigManager nacosConfigManager;

        @Override
        public void run(ApplicationArguments args) throws Exception {
            ConfigService configService = nacosConfigManager.getConfigService();
            // 给指定配置添加监听器
            configService.addListener("demo-nacos-config.yaml", "DEFAULT_GROUP", new AbstractListener() {

                /**
                 * 使用最新的配置数据进行回调。
                 *
                 * @param configInfo 在nacos服务器中的最新内容
                 */
                @Override
                public void receiveConfigInfo(String configInfo) {
                    System.out.println("=========================================");
                    System.out.println(configInfo);
                    System.out.println("=========================================");
                }
            });
        }

    }

}
