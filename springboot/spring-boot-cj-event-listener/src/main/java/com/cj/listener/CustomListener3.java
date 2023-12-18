package com.cj.listener;

import com.cj.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 通过注解@Component加载监听器
 * 通过@EventListener注解，简化了ApplicationListener接口实现
 */
@Component
public class CustomListener3 {


    @EventListener
    public void eventListener(CustomEvent event) {
        event.printMessage("CustomListener3");
    }

}
