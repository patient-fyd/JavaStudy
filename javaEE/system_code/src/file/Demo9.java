package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/4 16:17
 */
public class Demo9 {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("test2.txt")) {
            // 读文件
            byte[] b = new byte[1024];
            int len = inputStream.read(b);
            // .............
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
