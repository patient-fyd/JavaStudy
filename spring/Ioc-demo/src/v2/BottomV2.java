package v2;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/16 22:47
 */
public class BottomV2 {

    private TireV2 tireV2;

    public BottomV2(TireV2 tireV2){
        this.tireV2 = tireV2;
    }
    public void init(){
        System.out.println("Bottom v2 init");
        tireV2.init();
    }
}
