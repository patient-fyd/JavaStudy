package thread;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/21 11:41
 */
public class Demo6 {

    private static final long CONUNT = 20_0000_0000;
    private static void  serial(){
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < CONUNT; i++) {
            a++;
        }
        a = 0;
        for (long i = 0; i < CONUNT; i++) {
            a++;
        }
        long end = System.currentTimeMillis();
        System.out.println("单线程消耗的时间：" + (end - start) + "ms");
    }

    private static void concurrency(){
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            int a = 0;
            for (long i = 0; i < CONUNT; i++) {
                a++;
            }
        });
        Thread t2 = new Thread(() -> {
            int a = 0;
            for (long i = 0; i < CONUNT; i++) {
                a++;
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.println("多线程消耗的时间" + (end - start) + "ms");
    }
    public static void main(String[] args) {
        serial();
        //concurrency();
    }
}
