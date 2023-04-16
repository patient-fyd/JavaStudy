package old;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 构建“轮胎”
 * @DateTime: 2023/4/16 12:25
 */
public class Tire {
    // 尺寸
    private int size = 17;

    public Tire(int size){
        this.size = size;
    }
    public void init(){
        System.out.println("Tire size: " + size );
    }
}
