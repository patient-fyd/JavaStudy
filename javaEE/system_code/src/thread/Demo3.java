package thread;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/21 11:07
 */
public class Demo3 {
    public static void main(String[] args) {
        Thread t = new Thread() {
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

        t.start();
    }
}
