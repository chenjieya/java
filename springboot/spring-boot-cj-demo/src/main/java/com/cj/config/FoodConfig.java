package com.cj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * food.rice=米饭
 * food.meat=烤肉${food.rice}
 * @ConfigurationProperties(prefix = "food")
 * 声明这是配置文件中对应的类
 * prefix前缀指向配置文件中的一级目录
 */
@ConfigurationProperties(prefix = "food")
public class FoodConfig {

    private String rice;
    private String meat;

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
