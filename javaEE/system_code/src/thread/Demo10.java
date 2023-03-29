package thread;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/23 10:37
 */
public class Demo10 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("线程运行中");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                }
            }
            System.out.println("新线程执行结束");
        });

        t.start();
        Thread.sleep(5000);
        System.out.println("控制新线程退出");
        t.interrupt();
    }
}
