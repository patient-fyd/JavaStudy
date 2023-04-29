package com.fyd.controller;

import com.fyd.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/29 22:11
 */
@Component
public class DogBean {
    // @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Scope("prototype") // 默认是单例模式,prototype是多例模式
    @Bean
    public Dog dog() {
        Dog dog = new Dog();
        dog.setId(1);
        dog.setName("旺财");
        dog.setAge(8);
        return dog;
    }
}
