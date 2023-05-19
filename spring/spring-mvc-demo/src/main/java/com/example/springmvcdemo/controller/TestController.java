package com.example.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/20 1:23
 */
@Controller
public class TestController {

    /**
     * 请求转发
     *
     * @return
     */
    @RequestMapping("/test")
    public Object test() {
        return "forward:/login.html";
    }

    /**
     * 请求重定向
     *
     * @return
     */
    @RequestMapping("/test2")
    public Object test2() {
        return "redirect:/reg.html";
    }
}
