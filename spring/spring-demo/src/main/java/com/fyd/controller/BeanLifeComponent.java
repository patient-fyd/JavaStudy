package com.fyd.controller;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/8/19 4:45
 */
//@Component
public class BeanLifeComponent implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("执行了 Bean Name 通知" + name);
    }


    public void init(){
        System.out.println("执行了 init 方法");
    }

    @PostConstruct
    public void myPostConstruct(){
        System.out.println("执行了 myPostConstruct 方法");
    }

    /**
     * 销毁前执行方法
     */
    @PreDestroy
    public void myPreDestroy(){
        System.out.println("执行了 myPreDestroy 方法");
    }

    public void use(){
        System.out.println("执行了 use 方法");
    }
}
