package demo3;

/**
 * @Author:
 * @Description:
 * @Date: 2022/4/14 23:56
 */
class Animal {
    public String name;
    public int age;

    protected  void eat() {
        System.out.println(this.name+" 吃饭！Animal");
    }
}

class Cat extends Animal {
    public String hair;

    @Override
    protected void eat() {
        System.out.println(this.name+" 吃猫粮！");
    }

//    public void eat() {
//        System.out.println(this.name+" 吃猫粮！");
//    }

    public void mew() {
        System.out.println(this.name+" 正在叫！");
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println(this.name+" 吃狗粮！");
    }
}

class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println(this.name+" 吃鸟粮！");
    }

    public void fly() {
        System.out.println("正在飞！！！！");
    }
}

public class TestDemo {


    public static void main8(String[] args) {
        Animal animal = new Bird();
        //instanceof ::
        if(animal instanceof Bird ) {
            Bird bird = (Bird)animal;
            //向下转型
            bird.fly();
        }
    }


    public static void main7(String[] args) {
        Animal animal = new Bird();
        Bird bird = (Bird)animal;
        //向下转型
        bird.fly();
    }


    public static void function(Animal animal) {
        animal.eat();
    }

    public static void main5(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();

        function(cat);
        function(bird);
        function(dog);
    }

    public static void main4(String[] args) {
        Animal animal = new Cat();
        //向上转型
        animal.name = "mimi";
        animal.eat();//为什么调用子类的？？ 实际上编译的时候 这里还是Animal的eat()
    }

    public static void func(Animal animal) {

    }

    public static Animal func2() {
//        return new Animal();
        return new Cat();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        func(cat);
        func(new Cat());
    }

    public static void main2(String[] args) {
        /*Cat cat = new Cat();
        Animal animal = cat;*/
        Animal animal = new Cat();
        //向上转型
        animal.name = "mimi";
        animal.eat();

        //animal.mew(); 只能访问父类自己的特有的成员方法或者成员变量，
    }

    public static void main1(String[] args) {
        Cat cat = new Cat();
        cat.mew();
        cat.eat();

        Animal animal = new Animal();
        animal.eat();//这里 通过父类引用 只能访问父类自己特有的方法
    }
}