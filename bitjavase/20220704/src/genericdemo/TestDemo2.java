package genericdemo;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/4 20:46
 */

class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}


/**
 * 写一个泛型类，类中有个方法，求数组的最大值
 *
 * T extends Comparable<T>是泛型的上界，在编译的过程中，T类型会被擦除为Object类，Object类里并没有Comparable接口
 * 所有我们要写定，让它擦除到有Comparable接口这个类为止。
 */
class Alg<T extends Comparable<T>> {
    public T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }
}

class Alg2 {

    /**
     * 静态的泛型方法
     * 静态的泛型方法 需要在static后用<>声明泛型类型参数
     * @param array
     * @param <T>
     * @return
     */
    public static<T extends Comparable<T> > T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }
}



public class TestDemo2 {

    public static void main1(String[] args) {

    }
    public static void main(String[] args) {
        //引用类型：不能直接比较大小
        Alg<Integer> alg = new Alg<Integer>();
        Integer[] array = {1,4,5,21,8,19};
        Integer max = alg.findMax(array);
        System.out.println(max);

        Alg<Student> alg2 = new Alg<>();
        Student[] students = new Student[3];
        students[0] = new Student("bit",15);
        students[1] = new Student("hello",25);
        students[2] = new Student("gfy",5);

        //这里的学生类，怎么比较学生的大小呢？
        //我们可以继承一个比较器接口
        Student student = alg2.findMax(students);
        System.out.println(student);
    }
}
