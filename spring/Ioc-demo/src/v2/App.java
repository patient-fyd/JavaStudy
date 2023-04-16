package v2;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/16 22:59
 */
public class App {

    public static void main(String[] args) {
        // 构建并运行车
        CarV2 carV2 = new CarV2(new FrameworkV2(new BottomV2(new TireV2(15, "白色"))));
        carV2.init();
    }
}
