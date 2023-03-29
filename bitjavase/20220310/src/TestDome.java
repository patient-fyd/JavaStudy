public class TestDome {
    public static void main(String[] args) {

    }

    public static void main1(String[] args) {
        //int a  = 10;
        //a+=9;//a = a+9
        //System.out.println(a);
        int a = 99;
        short s = 0;
        //s = (short) (s+a);
        s += a;//s = s+a;会自动进行强制类型转换
        System.out.println(s);
    }
}
