package thread;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/21 10:47
 */

class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("hello thread!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();

        while(true){
            System.out.println("hello main!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
