package com.fyd.controller;

import com.fyd.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/8/12 17:48
 */
@Component
public class DogBean {
    @Scope("prototype")
    @Bean
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("旺财");
        dog.setId(1);
        dog.setAge(5);
        return dog;
    }
}
