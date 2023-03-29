package com.fourteen.ljy;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/5/7 19:43
 */
public class Person {
    String name = "默认";
    int age = 0;

    public void eat() {
        System.out.println(this.name+"吃饭");
    }



    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
}

