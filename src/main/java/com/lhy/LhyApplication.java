package com.lhy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.lhy.**.dao"})
public class LhyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LhyApplication.class, args);
    }

}
