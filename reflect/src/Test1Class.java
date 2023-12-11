/**
 * Author: patient.fyd@gmail.com
 * Description: 获取类对象的三种方法
 * DateTime: 2023/12/11 11:29
 */
public class Test1Class {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Student.class;
        System.out.println(c1.getName()); // 全类名
        System.out.println(c1.getSimpleName()); // 简称类名

        Class c2 = Class.forName("Student");
        System.out.println(c1 == c2);

        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3 == c2);
    }
}
