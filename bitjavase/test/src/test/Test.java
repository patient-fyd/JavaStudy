package test;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/17 23:34
 */

interface Achievement
{
    public abstract float average() ;
}
class Person {
    String name;
    int age;
    public Person (String newName , int newAge){
        name = newName;
        age=newAge ;
    }
    public void introduce ( ) {
        System.out.println ( "你好，我是"+name+"，今年"+age+"岁");
    }
}
class Student extends Person implements Achievement {
    int chinese , math, english;
    public Student (String newName ,int newAge){
        super(newName , newAge);
    }
    public void setScore (int c,int m,int e){
        chinese=c;
        math=m;
        english=e;
    }
    public float average (){
        return (chinese+math+english)/3;
    }


}
public class Test {
    public static void main(String[] args){
        Student s1 = new Student( "张三",16);
        s1.introduce ( ) ;
        s1.setScore (80,90,80) ;
        System.out.println ("我的平均成绩为:"+s1.average ( ) );
    }
}

