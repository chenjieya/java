package com.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 声明我们的入口类，并声明是springboot项目
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // 使用springApplication类的静态方法 启动springboot程序
        SpringApplication.run(DemoApplication.class,args);
    }

}
