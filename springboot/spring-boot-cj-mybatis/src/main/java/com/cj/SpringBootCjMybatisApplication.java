package com.cj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cj.dao")
public class SpringBootCjMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCjMybatisApplication.class, args);
    }

}
