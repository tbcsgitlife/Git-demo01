package com.example.springboot_demo1;

import com.example.springboot_demo1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemo1ApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {

    }

}
