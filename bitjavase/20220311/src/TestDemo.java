public class TestDemo {

    public static void main(String[] args) {
        int ji = 0;
        int ou = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2 != 0){
                ji += i;
            }
            else{
                ou += i;
            }
            
        }
        System.out.println(ji);
        System.out.println(ou);
    }
    public static void main1(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i%15 == 0) {
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}
