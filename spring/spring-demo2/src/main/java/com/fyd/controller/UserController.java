package com.fyd.controller;

import com.fyd.component.UserComponent;
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
    /*private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    // 3、构造器注入
    private UserService userService;
    private UserComponent userComponent;
    // 只有一个构造方法时，可以省略@Autowired，但是如果有多个构造方法时，必须加上@Autowired
    @Autowired
    public UserController(UserService userService, UserComponent userComponent) {
        this.userService = userService;
        this.userComponent = userComponent;
    }

    public UserController(UserService userService, Integer number) {
        this.userService = userService;
    }


    public void sayHello() {
        System.out.println("Hello!");
        userService.doService();
        userComponent.doComponent();
    }
}
