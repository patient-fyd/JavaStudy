import com.fyd.controller.ScopeController;
import com.fyd.controller.ScopeController2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/8/8 22:56
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        ScopeController scopeController = context.getBean(ScopeController.class);
        scopeController.doScope();
        System.out.println();

        ScopeController2 scopeController2 = context.getBean(ScopeController2.class);
        scopeController2.doScope();

    }
}
