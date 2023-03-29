import java.util.Scanner;

import static com.sun.deploy.uitoolkit.impl.awt.AWTClientPrintHelper.print;
import static jdk.nashorn.internal.objects.NativeFunction.function;

/**
 * @Author : fourteen
 * @Description :方法重载，递归等作业
 * @Date : 2022/3/20 18:01
 */
public class TestDemo2 {
    public static int func(int num){
        if (num == 1){
            return 1;
        }
        return num * func(num - 1);
    }
    public static void main6(String[] args) {
        /**
         * 递归求 N 的阶乘
         */
        Scanner sc = new Scanner(System.in);
        int ret = func(sc.nextInt());
        System.out.println(ret);
    }




    public static int add1(int num){
        if (num == 1) {
            return 1;
        }
        return num + add1(num - 1);
    }
    public static void main5(String[] args) {
        /**
         * 递归求 1 + 2 + 3 + ... + 10
         */
        Scanner sc = new Scanner(System.in);
        int ret = add1(sc.nextInt());
        System.out.println(ret);
    }




    public static void print(int num) {
        if (num > 9) {
            print(num / 10);
        }
        System.out.println(num % 10);
    }
    public static void main4(String[] args) {
        /**
         * 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }



    public static int sum(int num) {
        if (num < 10) {
            return num;
        }
        return num % 10 + sum(num / 10);
    }
    public static void main3(String[] args) {
        /**
         * 写一个递归方法，输入一个非负整数，返回组成它的数字之和
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ret = sum(a);
        System.out.println(ret);
    }



    public static int fib(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else{
            int temp = fib(n - 1) + fib(n - 2);
            return temp;
        }
    }
    public static void main(String[] args) {
        /**
         * 递归求斐波那契数列的第N项
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要打印数列的第几项：");
        int n = sc.nextInt();
        int ret = fib(n);
        System.out.println("第"+n+"项为"+ret);
    }



    public static int max(int x,int y) {
        return Math.max(x, y);
    }
    public static double max(double x,double y) {
        return Math.max(x, y);
    }
    public static double max(double x,double y,int z) {
        double max = 0;
        if( x>y) {
            max = x;
        }
        else {
            max = y;
        }
        if( z>max) {
            max = z;
        }
        return max;
    }
    public static void main1(String[] args) {
        /**
         * 求最大值方法的重载
         */
        double ret = max(0.6,0.3,5);
        System.out.println(ret);
    }

}
