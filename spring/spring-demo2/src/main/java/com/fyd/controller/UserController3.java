package com.fyd.controller;

import com.fyd.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/26 23:14
 */
@Controller
public class UserController3 {

//    @Autowired
//    private User user;
    @Resource(name = "student_user1")
    private User user;

    public void doController() {
        System.out.println("do user controller 3");
        System.out.println("user id: " + user.getId() + " user name: " + user.getName() +
                " user age: " + user.getAge());
    }
}
