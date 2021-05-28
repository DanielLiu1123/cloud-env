package cn.liumouren.example.security.pure;

import cn.liumouren.example.security.pure.listener.EnterEvent;
import cn.liumouren.example.security.pure.listener.EnterEventPublisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Daniel Liu
 */
@SpringBootTest
public class CoreTest {

    @Autowired
    private EnterEventPublisher publisher;

    @Test
    public void test01(){
       publisher.publish(new EnterEvent("进入index"));
    }
}
