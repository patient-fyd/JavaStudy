package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/4 16:23
 */
public class Demo10 {
    public static void main(String[] args) {
        try (OutputStream OutputStream = new FileOutputStream("test.txt")) {

            OutputStream.write('h');
            OutputStream.write('e');
            OutputStream.write('l');
            OutputStream.write('l');
            OutputStream.write('o');

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
