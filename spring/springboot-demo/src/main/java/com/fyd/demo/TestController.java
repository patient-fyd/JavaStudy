package com.fyd.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/30 23:42
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "test,springboot";
    }
}
