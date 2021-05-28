package cn.liumouren.example.security.pure.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Liu
 */
@Component
public class EnterEventPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publish(EnterEvent event) {
        applicationContext.publishEvent(event);
    }
}
