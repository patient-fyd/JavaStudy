package com.bit.demo3;

/**
 * @Author : fourteen
 * @Description :类与对象，静态，代码块
 * @Date : 2022/3/28 1:11
 */
class Student {
    private String name;
    private int age;
    private double score;
    public static String classes;

    {
        System.out.println("实列代码块！优先构造方法执行，一般用来初始化成员变量(实列/普通)");
    }

    static {
        classes = "104Java1班";
        System.out.println("静态代码块！最先执行，一般用来初始化静态的数据成员,不管有几个对象，只执行一次");
    }
    static {
        classes = "104Java2班";
        System.out.println("静态代码块！1111111最先执行，一般用来初始化静态的数据成员,不管有几个对象，只执行一次");
    }



    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void doClass(){
        System.out.println(this.name +"正在上课");
    }

    public static void func() {
        System.out.println("这是一个静态的成员方法!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ",班级=" + classes +
                '}';
    }
}

public class TestDemo {

    public static void main(String[] args) {
        Student student1 = new Student("bit",18,34.6);

        System.out.println(student1);



    }
}
