package com.example.springsecuritydemo.dao;

import com.example.springsecuritydemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectByName(String username);

}
