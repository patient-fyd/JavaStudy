/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/1 20:20
 */
public class TestDemo2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        try {
            System.out.println(array[9]);
            System.out.println("haha");
        } catch (NullPointerException e) {
            System.out.println("空指针异常！");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常！");
            e.printStackTrace();
        } catch (Exception e) {//不建议直接用父类异常一次捕获多次异常
            e.printStackTrace();
        }
    }
}
