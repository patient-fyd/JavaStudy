import java.util.Scanner;

/**
 * @author fourteen
 * @Description 循环作业
 */
public class TestDemo1 {


    public static void main10(String[] args) {
        /**
         * 输出 1000 - 2000 之间所有的闰年
         */

        for (int i = 1000; i < 2000 ; i++) {
            if(i%4 == 0 && i%100 != 0 || i%400 == 0 ){
                System.out.print(i+" ");
            }
        }
    }




    public static void main9(String[] args) {
        /**
         * 打印 1 - 100 之间所有的素数
         */
        for (int i = 2; i < 100; i++) {
            int count = 0;
            for (int j =2; j < i ; j++) {
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(i+" ");
            }
        }
    }




    public static void main8(String[] args) {
        /**
         * 给定一个数字，判定一个数字是否是素数
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2; i < n; i++) {
           if(n%i == 0){
               count++;
           }
        }
        if(count == 0){
            System.out.println(n+"是素数");
        }
        else{
            System.out.println(n+"不是素数");
        }
    }




    public static void main7(String[] args) {
        /**
         * 根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
         */
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>0 && age <=18){
            System.out.println("少年");
        }
        else if(age>=19 && age <=28){
            System.out.println("青年");
        }
        else if(age>=29 && age <=55){
            System.out.println("中年");
        }
        else{
            System.out.println("老年");
        }
    }




    public static void main6(String[] args) {
        /**
         * 求出0～999之间的所有“水仙花数”并输出。
         * (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
         */
        for (int i = 100; i <999 ; i++) {
            int g = i%10;
            int s = i/10%10;
            int b = i/100;
            if(i == g*g*g + s*s*s + b*b*b){
                System.out.println(i);
            }
        }
    }




    public  static int fac(int a,int b){
        int c = a%b;
        while (c != 0){
            a = b;
            b = c;
            c = a%b;
        }
        return b;
    }
    public static void main5(String[] args) {
        /**
         * 求两个正整数的最大公约数
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("最大公约数为："+fac(a,b));

    }




    public static void main4(String[] args) {
        /**
         * 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        System.out.print("偶数位为：");
        for (i = 0; i < 32; i+=2) {
            System.out.print(((num>>i) & 1)+" ");
        }
        System.out.println();
        System.out.print("奇数位为：");
        for (i = 1; i < 32; i+=2) {
            System.out.print(((num>>i) & 1)+" ");
        }
    }



    public static void main3(String[] args) {
        /**
         * 求一个整数，在内存当中存储时，二进制1的个数。
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 0;i < 32;i++) {
            if(((num >> i) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }



    public static void main2(String[] args) {
        /**
         * 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,
         * 密码错误，可以重新输入，最多输入三次。三次均错，则提示退出程序
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入密码");
        String input = sc.nextLine();
        String passWord = "12345678";
        int count = 0;
        while(count < 2){
            if(!input.equals(passWord)){
                System.out.println("密码错误，请重新输入");
                input = sc.nextLine();
                count++;
            }
            else{
                System.out.println("登录成功");
                break;
            }
        }
        if(count == 2){
            if (!input.equals(passWord)) {
                System.out.println("三次输入密码错误，退出程序");
            }
            else{
                System.out.println("登录成功");
            }
        }
    }

    public static void main1(String[] args) {
        int count = 3;
        Scanner scanner = new Scanner(System.in);
        while (count != 0) {
            System.out.println("请输入你的密码：");
            String password = scanner.nextLine();
            if(password.equals("123")) {
                System.out.println("登录成功！");
                break;
            }else{
                count--;
                System.out.println("你还有 "+count+" 次机会！");
            }
        }
    }




    public static void main(String[] args) {
        /**
         * 输出n*n的乘法口诀表，n由用户输入。
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println("\t");
        }
    }


}
