package com.example.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2023/5/4 9:10
 */
@Controller
@ResponseBody   // 当前类返回的是非静态页面
@RequestMapping("/web")
public class WebController {

    //@RequestMapping(value = "/hi",method = RequestMethod.GET)
    @GetMapping("/hi")
    //@PostMapping("/hi")
    public Object sayHi(HttpServletRequest request, HttpServletResponse response){
        return "hi," + request.getParameter("name");
    }

    /**
     * 获取单个参数
     * @return
     */
    @GetMapping("/get1")
    public String getParam1(String name){
        return "value:  " + name;
    }

    /**
     * 获取多个参数
     * @param name
     * @param age
     * @return
     */
    @GetMapping("/get2")
    public String getParam2(String name,Integer age){
        return "name:" + name + " age: " + age;
    }
}
