package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/2 9:28
 */
public class Demo6 {
    public static void main(String[] args) {
        // 使用一下 InputStream

        InputStream inputStream = null;
        try {
            // 1. 打开文件
            inputStream = new FileInputStream("./test2.txt");

            // 2. 读取文件.
//        while (true) {
//            int b = inputStream.read();
//            if (b == -1) {
//                // 文件读完了.
//                break;
//            }
//            System.out.println(b);
//        }

            byte[] b = new byte[1024];
            int len = inputStream.read(b);
//        System.out.println(len);
//        for (int i = 0; i < len; i++) {
//            System.out.println(b[i]);
//        }
            String s = new String(b, 0, len, "utf8");
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭文件
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}