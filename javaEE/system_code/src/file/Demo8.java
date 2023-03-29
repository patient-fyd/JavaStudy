package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/4 16:08
 */
public class Demo8 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("test.txt");
        Scanner scanner = new Scanner(inputStream);
        String s = scanner.next();
        System.out.println(s);
        inputStream.close();
    }
}
