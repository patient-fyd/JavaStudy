package v2;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 控制反转的车
 * @DateTime: 2023/4/16 22:44
 */
public class CarV2 {

    private FrameworkV2 frameworkV2;

    public CarV2(FrameworkV2 frameworkV2){
        // Car构造方法不会自己创建了
        this.frameworkV2 = frameworkV2;
    }


    public void init(){

        System.out.println("Car v2 init");
        // 依赖framework init()方法
        frameworkV2.init();
    }
}
