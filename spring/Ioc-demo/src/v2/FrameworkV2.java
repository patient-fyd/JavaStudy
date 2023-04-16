package v2;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/16 22:46
 */
public class FrameworkV2 {
    private BottomV2 bottomV2;

    public FrameworkV2(BottomV2 bottomV2){
        this.bottomV2 = bottomV2;
    }
    public void init(){
        System.out.println("Framework v2 init");
        bottomV2.init();
    }
}
