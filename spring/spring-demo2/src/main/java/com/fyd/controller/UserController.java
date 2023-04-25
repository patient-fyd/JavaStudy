package com.fyd.controller;

import com.fyd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/18 21:59
 */

@Controller
public class UserController {

    // 读取 UserService[从spring读取]

    // 1、 属性注入
    // @Autowired
    //private UserService userService;


     // 2、setter注入
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void sayHello() {
        System.out.println("Hello!");
        userService.doService();
    }
}
