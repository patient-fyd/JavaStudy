package com.fyd.controller;

import com.fyd.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 关于Bean作业域的demo
 * @DateTime: 2023/4/29 22:12
 */
@Controller
public class ScopeController {

    @Autowired
    private Dog dog;

    public void doScope() {
        System.out.println("do scope controller");
        System.out.println("原数据：" + dog.toString());
        // 修改
        Dog dog2 = dog;
        dog2.setName("小黑");
        System.out.println(dog2);
    }
}
