import java.util.Scanner;

public class TestDemo {

    public static void function2(){
        int[] array = {1,2,3};
        System.out.println(array[100]);
    }
    public static void main(String[] args) {
        try {
            function2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("asd;lfkja;l");
    }

    public static int function() {
        try {
            System.out.println(10/10);
            return 10;
        }catch (ArithmeticException e) {
            System.out.println("捕获到的异常");
        }finally {
            //尽量不要在finally语句中进行return
            //return -1;
        }
        return 9;
    }
    public static void main2(String[] args) {
        System.out.println(function());
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println(10/a);
            System.out.println("asdfas");
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("捕获到的异常");
        }finally {
            scanner.close();
            System.out.println("一般用来关闭资源");
            System.out.println("不管是否发生异常，finally一定会被执行");
        }
        System.out.println("其他业务逻辑");
    }
}
