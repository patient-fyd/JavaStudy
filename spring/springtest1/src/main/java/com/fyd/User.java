package com.fyd;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: User对象类
 * @DateTime: 2023/4/29 17:18
 */
public class User {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        	return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
