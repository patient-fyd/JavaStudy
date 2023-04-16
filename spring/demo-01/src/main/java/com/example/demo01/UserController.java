package com.example.demo01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2023/4/16 19:31
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/sayhi")
    public String sayHi(){
        return "Hi,ddddddddd";
    }
}
