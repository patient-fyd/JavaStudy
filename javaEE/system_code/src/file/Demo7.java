package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/4 16:05
 */
public class Demo7 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
        char[] buffer = new char[1024];
        int len = reader.read(buffer);
        for (int i = 0; i < len; i++) {
            System.out.println(buffer[i]);
        }
        reader.close();
    }
}
