package com.fyd.controller;

import com.fyd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/26 22:27
 */
@Controller
public class UserController2 {
    // 属性注入
    //@Autowired
//    @Resource
//    private UserService userService;

    // setter注入
    private UserService userService;

    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public void doController() {
        System.out.println("do user controller 2");
        userService.doService();
    }
}
