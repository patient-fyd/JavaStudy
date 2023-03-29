import java.util.Arrays;

public class TestDemo3 {

    public static String myToString(int[] array) {
        String ret = "0";
        for (int i = 0; i < array.length; i++) {
            ret = Arrays.toString(array);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};

        String ret = myToString(array);

        System.out.println(ret);
    }
}
