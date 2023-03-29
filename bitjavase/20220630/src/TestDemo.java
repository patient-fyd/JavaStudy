/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/6/30 1:16
 */
public class TestDemo {

    public static void function(int a) {
        if (a == 10) {
            throw new NullPointerException("a = 10");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        try {
//            同时只能抛出一个异常
//            //如果没有处理异常，那么就会交给JVN来处理，此时程序会立即异常终止
//            System.out.println(array[9]);
            function(10);
            System.out.println("这里没有执行");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获了一个数组越界异常");
        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获了一个空指针异常");
        }

        System.out.println("其他业务逻辑");

    }
}
