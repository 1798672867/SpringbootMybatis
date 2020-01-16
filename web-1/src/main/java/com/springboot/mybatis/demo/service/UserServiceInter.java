package com.springboot.mybatis.demo.service;

import com.springboot.mybatis.demo.dao.UserDao;
import com.springboot.mybatis.demo.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

public interface UserServiceInter {
    List<User> select();
}


