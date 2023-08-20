package com.fyd.springbootdemotest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/8/20 10:27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/sayhello")
    public String sayHello (){
        return "Hello,SpringBoot.";
    }
}
