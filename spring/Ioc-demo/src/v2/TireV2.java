package v2;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/16 22:47
 */
public class TireV2 {
    private int size = 15;
    private String color = "黑色";

    public TireV2(int size, String color){
        this.size = size;
        this.color = color;
    }

    public void init(){
        System.out.println("Tire v2 init " + size + " " + color);
    }
}
