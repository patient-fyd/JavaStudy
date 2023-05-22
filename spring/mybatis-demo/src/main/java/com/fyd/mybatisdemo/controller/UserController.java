package com.fyd.mybatisdemo.controller;

import com.fyd.mybatisdemo.model.UserInfo;
import com.fyd.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/22 9:38
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public List<UserInfo> getAll() {
        List<UserInfo> userList = null;
        return userService.getAll();
    }
}
