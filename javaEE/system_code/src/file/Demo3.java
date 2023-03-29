package file;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/2 8:46
 */
public class Demo3 {
    public static void main(String[] args) throws InterruptedException, IOException {
        // 文件删除
        File file = new File("helloworld.txt");
        // file.delete();
        // 程序退出时才删除, 创建一些临时文件.
        file.deleteOnExit();
        Thread.sleep(5000);
        System.out.println(file.exists());
    }
}
