package com.cj;

import com.cj.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication
 * 声明我们的入口类，并声明是springboot项目
 *
 * @EnableConfigurationProperties({FoodConfig.class})
 * 告诉主程序入口类，要自动引入配置文件
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class DemoApplication {

    public static void main(String[] args) {
        // 使用springApplication类的静态方法 启动springboot程序
        SpringApplication.run(DemoApplication.class,args);
    }

}
