package com.fourteen.ljy;

/**
 * @Author: Fourteen-Y
 * @Description:
 */
public class TestDemo1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.age);
        System.out.println(person1.name);
        System.out.println("=================================");

        Person person2 = new Person("lisi");

        System.out.println(person2.age);
        System.out.println(person2.name);
        System.out.println("=================================");

        Person person3 = new Person("wang",19);

        System.out.println(person3.age);
        System.out.println(person3.name);
        person3.eat();
    }

}
