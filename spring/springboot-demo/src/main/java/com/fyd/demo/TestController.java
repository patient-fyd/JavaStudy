package com.fyd.demo;

import com.fyd.demo.model.MyList;
import com.fyd.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/30 23:42
 */
@RestController
public class TestController {

    // 用户自定义配置项读取
    @Value("${mykey.key1}")
    private  String mykey;

    // 读取系统配置项
    @Value("${server.port}")
    private String port;

    @Value("${mystring}")
    private String mystring;

    @Autowired
    private Student student;

    @Autowired
    private MyList myList;

    @RequestMapping("/test")
    public String test() {
        return "hi，" + myList.getDbtype().size() + " " + myList.getDbtype().get(0);
    }
}
