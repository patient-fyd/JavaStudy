/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/6/29 16:25
 */
public class Test {

    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("world");
        str = sb.toString();
        System.out.println(str);
    }

    public static void main1(String[] args) {
        String str = "hello";
        str = str + "world";
        System.out.println(str);
    }
}
