package com.cbs.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cbs.app.*")
@MapperScan(basePackages = "com.cbs.app.*")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
