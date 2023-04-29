import com.fyd.User;
import com.fyd.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/29 17:15
 */
public class App {

    public static void main(String[] args) {
        // spring得到上下文对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        // 通过上下文对象获取到Controller类
        UserController userController =
                context.getBean("userController",UserController.class);
        userController.doController();


    }
}
