package file;

import java.io.File;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/2 8:50
 */
public class Demo5 {
    public static void main(String[] args) {
        File file1 = new File("./test1.txt");
        File file2 = new File("./test2.txt");
        file1.renameTo(file2);
    }
}
