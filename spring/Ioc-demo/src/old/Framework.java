package old;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 构建“车身”
 * @DateTime: 2023/4/16 12:22
 */
public class Framework {

    // 底盘
    private Bottom bottom;

    public Framework(int size){
        bottom = new Bottom(size);
    }
    public void init(){
        System.out.println("Framework init");
        // 依赖Bottom run()方法
        bottom.init();
    }
}
