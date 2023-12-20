package com.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCjCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCjCacheApplication.class, args);
    }

}
