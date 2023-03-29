package thread;

import java.util.Scanner;


/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/30 15:03
 */
public class Demo16 {
    static class Counter {
        volatile public int flag = 0;
    }
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            while (counter.flag == 0) {
                //执行循环，啥也不干
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("进程结束");
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            counter.flag = scanner.nextInt();
        });
        t2.start();
    }
}
