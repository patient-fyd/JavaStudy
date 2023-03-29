
/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/6/29 21:18
 */
public class TestDemo {

    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        System.out.println(str);
    }

    public static void main2(String[] args) {
        String str = "abc";
        //实际在编译的时候用的是StringBuilder
        str = str + "def";
        System.out.println(str);
    }

    public static void main1(String[] args) {
        //StringBuffer是同步处理，线程安全的。
        StringBuffer buffer = new StringBuffer("hello");
        //拼接字符串
        buffer.append("!!!");
        //buffer.insert(1, "abc");从中间插入字符串
        //buffer.reverse();使字符串倒序
        System.out.println(buffer);

        //StringBuilder不是同步处理，不是线程安全的
        StringBuilder sb = new StringBuilder("abc");
        sb.append(111);
        System.out.println(sb);
    }
}
