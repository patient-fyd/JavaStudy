import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2023/4/13 9:17
 */
public class App {
    public static void main(String[] args) {

        // 1.得到Spring的上下文对象，创建的时候需要配置Spring配置信息
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // 2.加载某个bean
        User user = (User) context.getBean("user");

        // 3.调用方法
        System.out.println(user.sayHi("Fourteen-Y"));
    }
}
