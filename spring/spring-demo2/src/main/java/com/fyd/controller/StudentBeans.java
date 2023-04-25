package com.fyd.controller;

import com.fyd.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/25 14:26
 */
@Component
public class StudentBeans {
    // Bean方法注解只能使用到无参的方法上，因为spring初始化的时候无法提供参数
    @Bean(name = "student_user1")
    public User student_user() {
        User user = new User();
        user.setId(1);
        user.setName("StudentBeans:fyd");
        user.setAge(18);
        return user;
    }
}
