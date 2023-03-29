package genericdemo;

import java.util.Objects;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/5 15:44
 */
public class TestDemo6 {
    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        System.out.println(a.equals(b));
    }

    public static void main2(String[] args) {
        Integer a = 10;
        int b = a;
        //自动拆箱底层默认调用intvalue();
        double d = a;
        //手动拆箱
        double d2 = a.doubleValue();
        System.out.println(b);
    }

    public static void main1(String[] args) {
        int a = 10;
        //自动装箱
        Integer b = a;
        //手动装箱
        Integer c = Integer.valueOf(a);
        System.out.println(b);
    }
}
