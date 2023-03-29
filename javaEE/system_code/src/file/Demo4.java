package file;

import java.io.File;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/2 8:49
 */
public class Demo4 {
    public static void main(String[] args) {
        File file = new File("test/aa/1");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println("=========================");
        // file.mkdir();
        file.mkdirs();
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
    }
}
