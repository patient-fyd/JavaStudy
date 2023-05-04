import com.fyd.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/17 23:58
 */
public class App {
    public static void main(String[] args) {
        // 1.得到spring上下文对象
        // applicationContext是BeanFactory的子接口，它是一个更高级的容器，它除了具有BeanFactory的所有功能外，还提供了更多的企业级功能，如：事件发布、国际化、资源访问、Web应用程序上下文等。
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("spring-config.xml");
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        // 2.从spring容器中获取对象
        // 2.1.通过id获取
        User user = (User) beanFactory.getBean("user");
//        // 2.2.通过类型获取
//        User user2 = context.getBean(User.class);
//        // 2.3.通过id和类型获取
//        User user3 = context.getBean("User", User.class);
        // 3.调用对象的方法
        user.sayHi();
    }
}
