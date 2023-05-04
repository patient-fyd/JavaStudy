package com.example.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2023/5/4 9:10
 */
@Controller
@ResponseBody   // 当前类返回的是非静态页面
@RequestMapping("/web")
public class WebController {

    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    public Object sayHi(){
        return "hi,springMVC";
    }
}
