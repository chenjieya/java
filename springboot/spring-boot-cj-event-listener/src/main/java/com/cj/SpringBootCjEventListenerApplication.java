package com.cj;

import com.cj.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCjEventListenerApplication {

    public static void main(String[] args) {

        // 自定义事件，监听方式，通过run返回的容器

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootCjEventListenerApplication.class, args);
        // 获取容器后，加载自定义监听器，进行监听
        context.addApplicationListener(new CustomListener1());

    }

}
