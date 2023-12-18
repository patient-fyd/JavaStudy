import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2023/12/11  13:53
 * Description:
 */
@Data
@AllArgsConstructor
public class Cat {
    private String name;
    private int age;

    private Cat() {
        System.out.println("无参构造方法执行了");
    }
}
