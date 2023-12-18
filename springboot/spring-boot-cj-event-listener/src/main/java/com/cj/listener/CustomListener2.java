package com.cj.listener;

import com.cj.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 通过注解@Component 加载监听器，
 * 这样就不需要在启动类中加载监听器了
 */
@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener2");
    }
}
