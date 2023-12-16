package com.cj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * vegetables.potato="土豆"
 * vegetables.tomato="西红柿"
 * vegetables.carrot="胡萝卜"
 *
 * @Configuration: 声明了这是一个配置类，在spring中可以替代xml文件
 * @ConfigurationProperties(prefix = "vegetables")：声明这是配置文件类，并且声明前缀
 * @PropertySource("classpath:vegetables.properties")：指定配置文件位置
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
public class VegetableConfig {

    private String potato;
    private String tomato;
    private String carrot;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getTomato() {
        return tomato;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public String getCarrot() {
        return carrot;
    }

    public void setCarrot(String carrot) {
        this.carrot = carrot;
    }
}
