import java.util.Arrays;
import java.util.Random;

/**
 * @Author : fourteen
 * @Description :数组的创建和使用等_作业
 * @Date : 2022/3/21 17:01
 */
public class TestDemo3 {

    public static  void toString(int[] array) {
        String str1 = "[";
        System.out.print(str1);
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ",");
        }
        String str2 = "]";
        System.out.print(array[array.length-1] + str2);
    }
    public static void main(String[] args) {
        /**
         * 实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
         * 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
         */
        int[] array = new int[]{1,2,3,4,5};
        toString(array);


    }




    public static int[] copyOf(int[] a) {
        int[] array1 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array1[i] = a[i];
        }
        return array1;
    }
    public static void main6(String[] args) {
        /**
         * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
         */
        int[] array = new int[] {1,2,3,4,5};
        int[] array1 = copyOf(array);
        String ret = Arrays.toString(array1);
        System.out.println(ret);
    }





    public static void main5(String[] args) {
        /**
         * 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
         */
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }




    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main4(String[] args) {
        /**
         * 实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
         */
        int[] array = new int[]{1,2,3,4,5};
        printArray(array);
    }




    public static  int[] transform(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] *= 2;
        }
        return array;
    }
    public static void main3(String[] args) {
        /**
         * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
         * 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
         */
        int[] array = new int[]{1,2,3,4,5};
        int[] array1 = transform(array);
        String ret = Arrays.toString(array1);
        System.out.println(ret);

    }




    public static int sum(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
        }
        return temp;
    }
    public static void main2(String[] args) {
        /**
         * 实现一个方法 sum, 以数组为参数, 求数组所有元素之和
         */
        int[] array = new int[]{1,2,3,4,5};
        int ret = sum(array);
        System.out.println(ret);
    }




    public static double avg(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    public static void main1(String[] args) {
        /**
         * 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
         */
        int[] array = new int[]{1,2,3,4,5};
        double ret = avg(array);
        System.out.println(ret);
    }
}
