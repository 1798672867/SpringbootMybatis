package com.springboot.mybatis.demo.dao;

import com.springboot.mybatis.demo.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> select();
}
