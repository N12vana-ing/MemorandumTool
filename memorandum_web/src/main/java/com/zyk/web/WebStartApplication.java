package com.zyk.web;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@EnableDubbo
@SpringBootApplication()
public class WebStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebStartApplication.class,args);
    }
}
