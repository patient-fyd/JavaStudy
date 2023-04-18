import com.fyd.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/17 23:58
 */
public class App {
    public static void main(String[] args) {
        // 1.得到spring上下文对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        // 2.从spring容器中获取对象
        User user = (User) context.getBean("user");
        // 3.调用对象的方法
        user.sayHi();
    }
}
