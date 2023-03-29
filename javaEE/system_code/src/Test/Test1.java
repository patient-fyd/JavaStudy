package Test;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/23 14:59
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            final int n = i;
            threads[n] = new Thread(() -> {
                System.out.println(n);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        for(Thread t : threads){
            t.start();
        }
        for(Thread t : threads){
            t.join();
        }

        System.out.println("ok");
    }
}
