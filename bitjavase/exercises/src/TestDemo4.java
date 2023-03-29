import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author : fourteen
 * @Description :数组作业
 * @Date : 2022/3/23 13:23
 */
public class TestDemo4 {
    public static int appearOnce1(int[] array){
            int num=0;
            for(int i=0;i<array.length;i++){
                num^=array[i];
            }
            return num;
    }
    public static int appearOnce(int[] array){
        for (int i = 0; i < array.length; i++){
            int temp = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]){
                    temp++;
                }
            }
            if(temp == 1){
                return array[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        /**
         * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
         */
        int[] array = new int[]{2,4,1,4,2};
        int ret = appearOnce1(array);
        if(ret == -1){
            System.out.println("不存在只出现一次的元素");
        } else {
            System.out.println(ret);
        }
    }





    public static void bubblingSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length - i -1 ;j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main3(String[] args) {
        /**
         * 给定一个整型数组, 实现冒泡排序(升序排序)
         */
        int[] array = new int[]{11,23,13,44,5};
        bubblingSort(array);
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }






    public static void judgementSort(int[] array){
        int count = 0;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] <= array[i + 1]){
                count++;
            }
        }
        if (count == array.length-1) {
            System.out.println(Arrays.toString(array)+"是有序的");
        } else {
            System.out.println(Arrays.toString(array)+"是无序的");
        }
    }
    public static void main2(String[] args) {
        /**
         * 给定一个整型数组, 判定数组是否有序（递增）
         */
        int[] array = new int[]{1,2,3,4,5};
        judgementSort(array);

    }





    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length - 1;
        int mid = (left+right)/2;

        while (array[mid] != key) {
            if(key > array[mid]){
                left = mid + 1;
                mid = (left + right)/2;
            } else{
                right = mid - 1;
                mid = (right + left)/2;
            }
        }
        return mid;
    }
    public static void main1(String[] args) {
        /**
         * 给定一个有序整型数组, 实现二分查找
         */
        int[] array = new int[]{1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要查找的数字：");
        int key = sc.nextInt();
        int ret = binarySearch(array,key);
        System.out.println("你要查找的数字的下标是"+ret);
    }
}
