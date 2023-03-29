/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/2 11:03
 */
public class Test111 {
    String s1 = "abc" + "def";//1
    String s2 = new String(s1);//2
    if(s1.equals(s2))//3
            System.out.println(".equals succeeded");/* 4 */
    if(s1==s2)//5
            System.out.println("==succeeded");//6

}
