package com.fyd.controller;

import com.fyd.model.Dog;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/8/12 18:04
 */
@Controller
public class ScopeController2 {
    @Resource
    private Dog dog;

    public void doScope(){
        System.out.println("do scope controller2");

        System.out.println(dog.toString());
    }
}
