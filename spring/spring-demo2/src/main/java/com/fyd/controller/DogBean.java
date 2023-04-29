package com.fyd.controller;

import com.fyd.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/29 22:11
 */
@Component
public class DogBean {
    @Bean
    public Dog dog() {
        Dog dog = new Dog();
        dog.setId(1);
        dog.setName("旺财");
        dog.setAge(8);
        return dog;
    }
}
