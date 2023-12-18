package com.cj.listener;

import com.cj.event.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * 通过配置文件的方式去加载监听器，移步配置文件去查看
 */
public class CustomListener4 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener4");
    }
}
