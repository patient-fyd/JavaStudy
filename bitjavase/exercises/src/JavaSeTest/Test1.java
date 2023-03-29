package JavaSeTest;

import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description: 输入一个字符串，求出该字符串包含的字符集合，按照字母输入的顺序输出。
 * 输入描述:
 * 每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
 * 输出描述:
 * 每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
 * @Date: 2022/7/2 23:52
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int[] array = new int[52];

        for(int i = 0;i < str1.length();i++) {
            char ch = str1.charAt(i);
            if(array[ch-'A'] == 0){
                array[ch-'A']++;
                System.out.print(ch);
            }
        }
    }
}
