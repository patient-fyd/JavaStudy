package thread;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/24 10:03
 */
public class Demo13 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {

                System.out.println("hello thread!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        },"我的线程");

        System.out.println(t.getState());

        t.start();

        Thread.sleep(500);
        System.out.println(t.getState());

        t.join();

        System.out.println(t.getState());
    }
}
