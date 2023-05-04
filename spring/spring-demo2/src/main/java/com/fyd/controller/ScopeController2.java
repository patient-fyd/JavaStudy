package com.fyd.controller;

import com.fyd.model.Dog;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 关于Bean作用域的demo
 * @DateTime: 2023/4/29 22:19
 */
@Controller
public class ScopeController2 {
    @Resource
    private Dog dog;

    public void doScope() {
        System.out.println("do scope controller 2");
        System.out.println(dog.toString());
    }
}
