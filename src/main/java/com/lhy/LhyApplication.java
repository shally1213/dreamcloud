package com.lhy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lhy.**.dao"})
public class LhyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LhyApplication.class, args);
    }

}
