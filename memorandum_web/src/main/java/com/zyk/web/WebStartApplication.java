package com.zyk.web;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableSwagger2Doc
@SpringBootApplication()
public class WebStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebStartApplication.class,args);
    }
}
