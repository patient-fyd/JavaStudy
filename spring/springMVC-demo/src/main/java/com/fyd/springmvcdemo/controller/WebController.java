package com.fyd.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/8/23 9:56
 */
@Controller			// 控制器，在spring启动的时候加载并注册
//@ResponseBody		// 当前类返回的是非静态页面
@RequestMapping("/web")	// 使用/web 能访问到当前类
public class WebController {

    /**
     *使用/web/hello 能访问到当前方法
     */
    @RequestMapping("/hello")
    public Object sayHello() {
        return "Hello, Spring MVC!";
    }

    /**
     *使用/web/hello2 能访问到当前方法
     */
    @RequestMapping("/hello2")
    public Object sayHello2() {
        return "/index.html";
    }
}