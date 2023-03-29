package thread;

/**
 * @Author: Fourteen-Y
 * @Description: 创建两个线程，让着两个线程同时并发的对一个变量自增5万次，最终预期能够一共自增10万次。
 * @Date: 2022/7/24 10:43
 */

class Counter {
    /**
     *     用来保存计数的变量
     */
    public int count;
    synchronized public void increase() {
        count++;
    }
}
public class Demo14 {

    /**
     * 这个实例用来进行累加
     */
    public static Counter counter = new Counter();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.increase();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.increase();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count:"+ counter.count);

    }
}
