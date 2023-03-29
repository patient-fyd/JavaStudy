package thread;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/23 10:30
 */
public class Demo9 {
    private static boolean isQuit = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (!isQuit) {
                System.out.println("线程运行中~~~~");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("新线程执行结束");
        });

        t.start();
        Thread.sleep(5000);
        System.out.println("控制线程结束");
        isQuit = true;

    }
}
