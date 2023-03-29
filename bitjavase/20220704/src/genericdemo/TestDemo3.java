package genericdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/4 21:13
 */
class Person{

}
class Student2 extends Person{

}
public class TestDemo3 {
    //Student 是 Person 的子类，那么 List<Student> 也应该是 List<Person> 的子类。但是泛型是不支持这样的父子类关系的。
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<Person>();
        List<Student2> list2 = new ArrayList<Student2>();

    }
}
