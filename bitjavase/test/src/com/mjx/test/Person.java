package com.mjx.test;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/6/9 1:05
 */
public class Person {
    private String id;

    private String sf;

    private String name;

    private int age;

    Person(String sf,String id,String name,int age) {

        this.sf=sf;

        this.id=id;

        this.name=name;

        this.age=age;

    }

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public String getSf() {

        return sf;

    }

    public void setSf(String sf) {

        this.sf = sf;

    }

}

