package thread;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/21 9:20
 */

class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("hello thread!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        //创建一个线程
        Thread t = new MyThread();
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
