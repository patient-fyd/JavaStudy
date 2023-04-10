/**
 * @Author : fourteen
 * @Description :
 * @Date : 2022/3/29 17:23
 */
public class HasStatic {
    private static int x = 100;
    public static void main(String args[]) {
        HasStatic hs1 = new HasStatic();
        x++;
        HasStatic hs2 = new HasStatic();
        x++;
        hs1 = new HasStatic();
        x++;
        HasStatic.x--;
        System.out.println(" x=" + x);
    }
}
