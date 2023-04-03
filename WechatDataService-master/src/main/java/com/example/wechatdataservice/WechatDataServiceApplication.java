package com.example.wechatdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.example.wechatdataservice.util")
@SpringBootApplication
public class WechatDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatDataServiceApplication.class, args);
    }

}
