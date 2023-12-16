package com.cj.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * food.rice=米饭
 * food.meat=烤肉${food.rice}
 * @ConfigurationProperties(prefix = "food")
 * 声明这是配置文件中对应的类
 * prefix前缀指向配置文件中的一级目录
 */
@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {

    private String rice;
    private String meat;
    private String[] drink;

}
