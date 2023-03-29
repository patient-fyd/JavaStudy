package thread;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/21 11:12
 */
public class Demo4 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
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
        };

        Thread t = new Thread(runnable);
        t.start();


    }
}
