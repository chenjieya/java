package com.cj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cj.mapper")
public class SpringBootCjMybatispluseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCjMybatispluseApplication.class, args);
    }

}
