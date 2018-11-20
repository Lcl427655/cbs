package com.cbs.app;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubboConfig
@ImportResource(locations= {"classpath:spring-dubbo.xml"})  //加载dubbo配置文件
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
