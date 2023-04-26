import com.fyd.component.UserComponent;
import com.fyd.config.UserConfiguration;
import com.fyd.controller.StuController;
import com.fyd.controller.UserController;
import com.fyd.controller.UserController2;
import com.fyd.model.User;
import com.fyd.repository.UserRepository;
import com.fyd.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;

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

        UserController2 userController2 =
                context.getBean("userController2", UserController2.class);
        userController2.doController();

//        UserController userController =
//                (UserController) context.getBean("userController", UserController.class);
//        userController.sayHello();
//        // 2.从spring容器中获取对象 [使用注解，默认的命名规则是类名小驼峰]
//        UserController userController =
//              (UserController) context.getBean("userController", UserController.class);
//        // 3.调用对象的方法
//        userController.sayHello();
//
//        StuController stuController =
//                (StuController) context.getBean("stuController", StuController.class);
//        stuController.doController();


        // 4.测试注解 使用的是对象的方法名来使用对象
//        User user = context.getBean("student_user1", User.class);
//        System.out.println("id: " + user.getId() + ", name: " + user.getName() + ", age: " + user.getAge());

    }
}
