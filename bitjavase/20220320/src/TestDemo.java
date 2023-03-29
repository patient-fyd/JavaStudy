public class TestDemo {
    public static void print(int[] array,int len) {
        if(len == 1) {
            System.out.println(array[len-1]);
            return;
        }
        System.out.println(array[len-1]);
        print(array, len-1);
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};

        print(array, array.length);
    }
}
