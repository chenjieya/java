package com.cj.controller;


import com.cj.bean.Food;
import com.cj.bean.VegeTables;
import com.cj.config.FoodConfig;
import com.cj.config.VegetableConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController是
 * @Controller和@ResponseBody的结合
 *
 * 返回的是json形式的数据
 */
@RestController
public class JsonController {

    // 配置文件中的默认值-第一种写法
    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;

    // 配置文件中默认值-第二种写法官方推荐

    /**
     * 通过自动注入，找到配置文件的类
     * 配置文件的类，需要写上注解
     * 入口类中需要写上注解，告诉springboot，这个类和配置文件进行绑定
     */
    @Autowired
    private FoodConfig foodConfig;


    @RequestMapping("/json")
    public Food json() {
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        food.setDrink(foodConfig.getDrink());
        return food;
    }

    @Autowired
    private VegetableConfig vegetableConfig;

    @RequestMapping("/vegetables")
    public VegeTables vegeTables() {
        VegeTables vegeTables = new VegeTables();
        vegeTables.setPotato(vegetableConfig.getPotato());
        vegeTables.setTomato(vegetableConfig.getTomato());
        vegeTables.setCarrot(vegetableConfig.getCarrot());
        return vegeTables;
    }

}
