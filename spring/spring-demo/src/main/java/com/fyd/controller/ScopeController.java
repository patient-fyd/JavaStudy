package com.fyd.controller;

import com.fyd.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 关于Bean作用域demo
 * @DateTime: 2023/8/12 17:50
 */
@Controller
public class ScopeController {

    @Autowired
    private Dog dog;

    public void doScope(){
        System.out.println("do scope controller");
        System.out.println("原始dog对象：" + dog.toString());

        Dog dog2 = dog;
        dog2.setName("小黑");
        dog2.setAge(10);
        dog2.setId(2);

        System.out.println("修改后的dog对象：" + dog.toString());
    }
}
