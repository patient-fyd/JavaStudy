/**
 * @Author : fourteen
 * @Description :类与对象
 * @Date : 2022/3/27 9:07
 */
class Person{
    private String name;
    private int age;

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

    public void sleep(){
        System.out.println(this.name + "正在睡觉！");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestDemo {
    public static void func2(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        func2(10);
    }


    public static void main1(String[] args) {
        Person person1 = new Person();
        person1.setName("gfy");
        person1.sleep();

    }
}
