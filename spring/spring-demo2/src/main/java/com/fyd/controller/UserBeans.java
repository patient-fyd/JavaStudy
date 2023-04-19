package com.fyd.controller;

import com.fyd.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/19 23:25
 */
@Component
public class UserBeans {

    /**
     * Bean注解必须配合五大类注解使用
     * @return
     */
    @Bean
    public User user() {
        User user = new User();
        user.setId(1);
        user.setName("fyd");
        user.setAge(18);
        return user;
    }
}
