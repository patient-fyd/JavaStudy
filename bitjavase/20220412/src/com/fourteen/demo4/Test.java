package com.fourteen.demo4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: fourteen-Y
 * @Description:
 * @Date: 2022/4/17 18:53
 */
/*
class Student  implements Comparable<Student> {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


     @Override
    public int compareTo(Student o) {
        */
/*if(this.age > o.age) {
            return 1;
        }else if(this.age == o.age) {
            return 0;
        }else {
            return -1;
        }*/
/*if(this.name.compareTo(o.name) > 0) {
             return 1;
         }else if(xxxxxxx) {
             return 0;
         }else {
             return -1;
         }*/
/*

        //return 0;

         return this.name.compareTo(o.name);

         //return o.age-this.age;
         //return (int)(this.score-o.score);
    }
}
*/

class Student {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
//比较器
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}

class StringComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.score-o2.score);
    }
}


public class Test {


    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhagnsan",98,78.9);
        students[1] = new Student("lisi",38,18.9);
        students[2] = new Student("abc",78,88.9);

        /*AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(students,ageComparator);*/

        /*StringComparator stringComparator = new StringComparator();
        Arrays.sort(students,stringComparator);*/


        ScoreComparator scoreComparator = new ScoreComparator();
        Arrays.sort(students,scoreComparator);

        System.out.println(Arrays.toString(students));

    }


    public static void main3(String[] args) {
        Student student1  = new Student("zhagnsan",38,78.9);

        Student student2  = new Student("lisi",38,18.9);

        //student1和student2比较
        //System.out.println(student1.compareTo(student2));


        //java里面不支持 这样的大于和小于号比较
        /*if(student1.compareTo(student2) > 0) {

        }*/

        /*int a  =10;
        int b = 20;
        if(a > b) {

        }*/

    }


    public static void main2(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhagnsan",98,78.9);
        students[1] = new Student("lisi",38,18.9);
        students[2] = new Student("abc",78,88.9);

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

    }


    public static void main1(String[] args) {
        int[] array = {1,21,4,15,6,17};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
