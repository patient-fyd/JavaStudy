import java.beans.Introspector;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/19 23:20
 */
public class App2 {
    public static void maill(String[] args) {

        String name = "UserController";
        String name2 = "UController";

        System.out.println("name: " + Introspector.decapitalize(name));
        System.out.println("name2: " + Introspector.decapitalize(name2));
    }
}
