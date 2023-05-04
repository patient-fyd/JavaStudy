package com.fyd.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/3 0:45
 */
@RestController
@Slf4j
public class StuController {

    @RequestMapping("/stu")
    public String sayhi() {
        log.info("hi,stu,i am info");
        return "Hi,Stu";
    }
}
