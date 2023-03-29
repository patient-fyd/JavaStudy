package com.test3;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/5/13 13:23
 */

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 10000; i < 999999; i++) {
            String str = Integer.toString(i);
            char[] ch = str.toCharArray();
            int len = ch.length;
            //判断是否回文的标志
            boolean flag = true;
            for (int k = 0, l = len - 1; k < len / 2; k++, l--) {
                if (ch[k] != ch[l]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int sum = 0;
                for (int j = 0; j < ch.length; j++) {
                    sum += Integer.valueOf(ch[j]) - 48;
                }
                if (sum == n) System.out.println(i);
            }
        }
    }
}
