package thread;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/31 9:41
 */
public class Demo17 {
    public static void main(String[] args) throws InterruptedException {
        Object objects = new Object();
        synchronized (objects) {
            System.out.println("wait 之前");
            objects.wait();
            System.out.println("wait 之前");
        }

    }
}
