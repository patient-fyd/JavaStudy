import org.springframework.stereotype.Controller;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2023/4/13 14:38
 */
@Controller
public class UserController {
    public void sayHi(String name) {
        System.out.println("Hi, "+name);
    }
}
