package com.example.springboot_demo1.mapper;
import java.util.List;

import com.example.springboot_demo1.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
* @author tbcs
* @description 针对表【tbl_user】的数据库操作Mapper
* @createDate 2022-07-29 10:11:34
* @Entity com.example.springboot_demo1.pojo.User
*/
@Repository
public interface UserMapper extends BaseMapper<User> {



}




