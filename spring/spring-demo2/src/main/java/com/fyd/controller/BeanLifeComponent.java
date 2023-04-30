package com.fyd.controller;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/30 15:59
 */
//@Component
public class BeanLifeComponent implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("执行了Bean Name的通知方法，Bean的名称为：" + name);
    }

    /**
     * 方法名随意定义
     * xml 中 init-method 属性指定
     */
    public void initMethod() {
        System.out.println("执行了initMethod方法");
    }

    /**
     * 前置方法，优先级比initMethod高
     */
    @PostConstruct
    public void myPostConstruct() {
        System.out.println("执行了PostConstruct方法");
    }

    /**
     * 销毁前执行的方法
     */
    @PreDestroy
    public void myPreDestroy() {
        System.out.println("执行了PreDestroy方法");
    }

    public void use(){
        System.out.println("执行了use方法");
    }

}
