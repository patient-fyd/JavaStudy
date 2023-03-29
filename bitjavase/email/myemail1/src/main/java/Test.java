import com.fourteen.demo.SenEmail;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/2 10:46
 */
public class Test {

    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e) {
            SenEmail.senEmailTest("3327555932@qq.com","1652257262@qq.com",
                    "测试的主题","测试邮件的内容！---");
            e.printStackTrace();
        }
    }
}