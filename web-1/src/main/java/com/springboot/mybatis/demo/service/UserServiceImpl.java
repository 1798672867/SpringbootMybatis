package com.springboot.mybatis.demo.service;

import com.springboot.mybatis.demo.dao.UserDao;
import com.springboot.mybatis.demo.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInter {
    @Resource
    private UserDao userDao;   //

    @Override
    public List<User> select() {

        List<User> UserList = userDao.select(); //调用dao层的方法
        return UserList;
    }
}
