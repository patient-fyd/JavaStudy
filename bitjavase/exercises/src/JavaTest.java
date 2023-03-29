import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/20 19:16
 */
public class JavaTest {

    public static char[] quchong(char[] array, char[] array2){
        for (int i = 1; i < array.length ; i++) {
            for (int j = 0; j < array.length - i -1 ;j++) {
                if (array[j] == array[i]) {
                    array2[i] = array[j];
                }
            }
        }
        return array2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        char[] str2 = str1.toCharArray();
        char[] str3 = new char[str2.length];
        str3 = quchong(str2,str3);
        for (char c : str3) {
            System.out.print(c);
        }


    }

}
