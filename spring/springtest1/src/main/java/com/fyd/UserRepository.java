package com.fyd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/29 17:15
 */
@Component
public class UserRepository {
    @Autowired
    private User user;

    @Bean
    public User user() {
        User user = new User();
        user.setId(1);
        user.setName("fyd");
        user.setAge(18);
        return user;
    }
    public void doRepository() {
        System.out.println("doRepository");
        System.out.println(user.toString());
    }
}
