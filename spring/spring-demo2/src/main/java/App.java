import com.fyd.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/18 21:31
 */
public class App {
    public static void main(String[] args) {

        // 1.得到spring上下文对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        // 2.从spring容器中获取对象 [使用注解，默认的命名规则是类名小驼峰]
        UserController userController = (UserController) context.getBean("userController", UserController.class);
        // 3.调用对象的方法
        userController.sayHello();
    }
}
