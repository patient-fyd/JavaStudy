import java.util.Arrays;
import java.util.Locale;

/**
 * @Author: Fourteen-Y
 * @Description: 字符串。
 * @Date: 2022/6/22 19:29
 */
public class StringDemo {

    public static void main(String[] args) {
        char[] ch =new char[]{'a','b','c'};
        String str = new String(ch);
        //当常量池没有的时候，手动入池
        str.intern();

        String str2 = "abc";

        System.out.println(str == str2);
    }

    public static void main14(String[] args) {
        String str1 = "hello";
        //常量编译的时候，这里直接认为是hello
        String ret = "he" + "llo";
        System.out.println(ret == str1);

        String str2 = "he";
        String str3 = "llo";
        //str2和str3是变量，在编译的时候，还不知道里面是什么
        String str4 = str2 + str3;
        System.out.println(str1 == str4);


    }

    /**
     * 字符串常量池其实就是一个StringTable的东西，是一个哈希表在堆上
     * @param args
     */
    public static void main13(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        //“hello”在常量池中，str2是直接引用了hello的value的地址
        System.out.println(str1 == str2);
        //str3因为有new,在堆中会产生新的value和hash,,
        System.out.println(str1 == str3);
    }

    public static void main12(String[] args) {
        String  str = "  ababc  abcd  ";
        //从字符串中截取，在Java中大部分的from和to都是左闭右开的
        //范围一定要合法
        String ret = str.substring(2,7);
        System.out.println(ret);

        //去除字符串左右两边的字符串，中间的空格不会去除
        System.out.println("[" + str.trim() + "]");
        System.out.println("[" + str + "]");
    }

    public static void main11(String[] args) {
        String str = "name=zhangsan&age=18";
        String[] strings = str.split("&");
        for (String s : strings) {
            String[] s1 = s.split("=");

            for (String x : s1) {
                System.out.println(x);
            }
        }
    }

    public static void main10(String[] args) {
        String str = "JAVA104 BIT&666";
        //如果一个字符串中有多个分隔符，可以用”|"作为连字符。
        String[] strings = str.split(" |&");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void main9(String[] args) {
        //String str = "abc efg jkl";
        String str = "192.168.1.1";
        //后面的参数代表最多切割为2组
        String[] strings = str.split("\\.",2);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void main8(String[] args) {
        String str = "ababscddcade";
        String str2 = str.replace('a','m');

        System.out.println(str);
        System.out.println(str2);
    }

    public static void main7(String[] args) {
        String s = "hello";
        //字符串转数组
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

        //以格式化的形式 转变为字符串
        String s1 = String.format("%d-%d-%d", 2019, 9,14);
        System.out.println(s1);

    }

    public static void main6(String[] args) {
        String s = "hello";
        String s2 = s.toUpperCase();
        System.out.println(s2);

        String s1 = "HellLiED";
        String s3 = s1.toLowerCase();
        System.out.println(s3);
    }

    public static void main5(String[] args) {
        int a = 10;
        String str = String.valueOf(a);
        System.out.println(str);

        String str2 = "1234";
        int ret = Integer.valueOf(str2);
        int ret2 = Integer.parseInt(str2);
        double ret3 = Double.parseDouble(str2);
        System.out.println(ret+1);
    }

    public static void main4(String[] args) {
        String str = "adekjfdafs";
        //从后往前找
        int index = str.lastIndexOf('a');
        System.out.println(index);

    }

    public static void main3(String[] args) {
        String str = "hello";
        //按下标输出字符
        char ch = str.charAt(0);
        System.out.println(ch);

        //从前往后找字符或字符串，输出下标
        int index1 = str.indexOf('e');
        //从下标3开始找，找不到输出-1
        int index2 = str.indexOf("ll",3);
        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);
    }

    public static void main2(String[] args) {
        //只要new了，就会开辟新的空间
        String s1 = new String("hello");
        String s2 = new String("Hello");

        System.out.println(s1.equals(s2));
        //忽视大小写比较
        System.out.println(s1.equalsIgnoreCase(s2));


        /*System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        System.out.println(s1.compareTo(s2));*/
    }

    public static void main1(String[] args) {

        String s1 = new String("hello");
        String s2 = new String("world");
        String s3 = s1;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.length());
    }
}
