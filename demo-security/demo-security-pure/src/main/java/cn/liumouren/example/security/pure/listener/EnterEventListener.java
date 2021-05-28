package cn.liumouren.example.security.pure.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Liu
 */
@Component
public class EnterEventListener implements ApplicationListener<EnterEvent> {

    @Override
    public void onApplicationEvent(EnterEvent event) {
        event.say();
    }
}
