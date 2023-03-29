package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/4 22:25
 */
public class Demo12 {
    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("test2.txt")) {
            // 此处的 PrintWriter 的用法就和 System.out 是一样的了
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println("aaa");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
