package com.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan("com.cj.dao")
@MapperScan(basePackages = "com.cj.tk.mybatis")
public class SpringBootCjMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCjMybatisApplication.class, args);
    }

}
