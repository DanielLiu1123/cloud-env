package cn.liumouren.example.security.pure.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author Daniel Liu
 */
public class EnterEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public EnterEvent(Object source) {
        super(source);
    }

    public void say() {
        System.out.println(getSource().toString());
    }
}
