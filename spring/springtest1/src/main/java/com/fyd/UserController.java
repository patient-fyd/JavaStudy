package com.fyd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/29 17:12
 */
@Controller
public class UserController {
    @Autowired
    private UserService service;

    public void doController() {
        System.out.println("doController");
        service.doService();
    }

}
