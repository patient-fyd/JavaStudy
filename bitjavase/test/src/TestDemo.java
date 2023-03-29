/**
 * @Author : fourteen
 * @Description :
 * @Date : 2022/3/27 13:22
 */

public class TestDemo{
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    };
}

//class Test {
//
//    public String toString() {
//
//        System.out.print("aaa");
//
//        return "bbb";
//
//    }
//
////    public static void hello() {
////        System.out.println("hello");
////    }
//}
//public class TestDemo {
//
//    private int count;
//
//    public static void main(String[] args) {
//
//        System.out.println(new Test());
//
//    }
//
//    public static void main4(String[] args) {
//
//        TestDemo test=new TestDemo(88);
//
//        System.out.println(test.count);
//
//    }
//
//    TestDemo(int a) {
//
//        count=a;
//
//    }
//
//
//    static boolean Paddy;
//    public static void main3(String args[]){
//        System.out.println(Paddy);
//    }
//
//    public static void main2(String[] args){
//
//        String s = "aaa";
//
//        System.out.println("s="+s);
//
//    }
//    public static void main1(String[] args) {
//        // TODO Auto-generated method stub
//        Test test=null;
//        //Test.hello();
//    }
//}