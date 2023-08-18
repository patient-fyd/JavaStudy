import com.fyd.controller.BeanLifeComponent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/8/19 4:55
 */
public class BeanLifeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        BeanLifeComponent beanLifeComponent = context.getBean("beanlife",BeanLifeComponent.class);
        beanLifeComponent.use();
        // 关闭容器
        context.destroy();

    }
}
