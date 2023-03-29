package genericdemo; /**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/4 18:22
 */

/**
 * <T>:占位符——>代表当前类是一个泛型
 * @param <T>
 */
class MyArray<T> {
    //public  Object[] array = new Object[10];
    public T[] array = (T[]) new Object[10];

    /**
     * 获取pos下标的值
     * @param pos
     * @return
     */
    public T getPos(int pos) {
        return array[pos];
    }

    /**
     * 给pos下标放一个元素
     * @param pos
     * @param value
     */
    public void setPos(int pos, T value) {
        array[pos] = value;
    }
}

public class TestDemo {

    public static void main(String[] args) {

        /**
         * 1、<Integer>>指定当前类种,使用的类型是Integer类型
         * 2、泛型帮我再编译期间做了2件事：
         *    存放元素的时候，进行类型的检查
         *    取元素的时候，帮我进行类型的转换
         * 3、<引用类型>
         */
        MyArray<Integer> myArray = new MyArray<>();

        myArray.setPos(1,2);
        Integer ret =  myArray.getPos(1);
        System.out.println(ret);

        MyArray<String> myArray2 = new MyArray<>();
        myArray2.setPos(1,"abc");


    }
}
