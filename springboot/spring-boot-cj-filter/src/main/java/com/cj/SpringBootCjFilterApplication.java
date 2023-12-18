package com.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootCjFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCjFilterApplication.class, args);
    }

}
