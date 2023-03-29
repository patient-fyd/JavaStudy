package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/4 22:25
 */
public class Demo11 {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("test2.txt")) {
            writer.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
