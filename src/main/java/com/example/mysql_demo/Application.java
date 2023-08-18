package com.example.mysql_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mysql_demo.mapper") // 指定扫描的 Mapper 接口包路径
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
