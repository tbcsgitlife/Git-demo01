package com.example.springboot_demo1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_demo1.pojo.User;
import com.example.springboot_demo1.service.UserService;
import com.example.springboot_demo1.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author tbcs
* @description 针对表【tbl_user】的数据库操作Service实现
* @createDate 2022-07-29 10:11:34
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




