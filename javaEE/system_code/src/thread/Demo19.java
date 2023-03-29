package thread;

/**
 * @Author: Fourteen-Y
 * @Description: 单例模式，懒汉和恶汉
 * @Date: 2022/8/17 17:07
 */

/**
 * 单例,饿汉的方式
 */
class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    /**
     构造方法设为私有的!
     */
    private Singleton() {

    }
}

/**
 * 懒汉模式
 */
class SingletonLazy {
    volatile private static SingletonLazy instance = null;

    public  static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

    private SingletonLazy() {

    }
}
public class Demo19 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance == instance2);
    }
}
