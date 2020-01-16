package com.springboot.mybatis.demo.controller;


import com.springboot.mybatis.demo.pojo.User;
import com.springboot.mybatis.demo.service.UserServiceInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class Handerller {

    @Resource
    private UserServiceInter userServiceInter;
    @RequestMapping("/test")
    @ResponseBody
    public List test() {
        List<User> Userlist = userServiceInter.select();
        return Userlist;
    }

    @RequestMapping("/user")
    public String data(Model model) {
        List<User> Userlist = userServiceInter.select();
        List list = new ArrayList<User>();
        list.add(Userlist);
        Iterator it= list.iterator();
        while (it.hasNext()){
         Object a= it.next();
            model.addAttribute("persion",a);
        }

        return "user";
    }

}
