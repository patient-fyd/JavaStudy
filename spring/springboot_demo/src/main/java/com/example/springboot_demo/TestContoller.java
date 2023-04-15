package com.example.springboot_demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/15 20:41
 */
@RestController
public class TestContoller {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
