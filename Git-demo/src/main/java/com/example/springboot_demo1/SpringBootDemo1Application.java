package com.example.springboot_demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@MapperScan("com.example.springboot_demo1.mapper")
public class SpringBootDemo1Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootDemo1Application.class, args);

    }
    @RequestMapping("/")
    public String index(){
        return "阿萨啊啊啊啊啊啊啊啊";
    }

}