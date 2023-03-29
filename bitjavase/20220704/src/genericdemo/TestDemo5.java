package genericdemo;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/4 23:31
 */
class Food {

}
class Fruit extends Food {

}
class Apple extends Fruit {

}
class Banana extends Fruit {

}

class Plate<T> {
    private T message ;

    public T getPlate() {
        return message;
    }

    public void setPlate(T message) {
        this.message = message;
    }

}

public class TestDemo5 {


    public static void main(String[] args) {
        Plate<Fruit> plate1 = new Plate<>();
        fun(plate1);

        Plate<Food> plate3 = new Plate<>();
        fun(plate3);

        //Plate<Apple> plate2 = new Plate<>();
        //fun(plate2);

    }

    //传参的是Fruit自己 或者 Fruit 的父类,适合写数据  不适合读数据
    public static void fun(Plate<? super Fruit> temp){

        temp.setPlate(new Apple());
        temp.setPlate(new Banana());

        //不可以的：Fruit的父类有很多，不一定就是某一个
        //temp.setPlate(new Food());

        //不安全 的
        //Fruit fruit = (Fruit)temp.getPlate();

    }




    public static void main1(String[] args) {

        Plate<Apple> plate1 = new Plate<>();

        Plate<Banana> plate2 = new Plate<>();

        fun1(plate1);

        fun1(plate2);

    }

    //通配符的上界，一般用来读取元素
    public static void fun1(Plate<? extends Fruit> temp){
        //temp.setPlate(new Apple());//这里不知道temp引用的子类是谁，所以，你不能往里边放元素

        System.out.println(temp.getPlate());

        //Fruit fruit = temp.getPlate();这里是可以的
    }
}
