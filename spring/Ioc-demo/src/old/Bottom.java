package old;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 构建“底盘”
 * @DateTime: 2023/4/16 12:24
 */
public class Bottom {
    // 轮胎
    private Tire tire;

    public Bottom(){
        tire = new Tire();
    }
    public void init(){
        System.out.println("Bottom init");
        // 依赖Tire init()方法
        tire.init();
    }
}
