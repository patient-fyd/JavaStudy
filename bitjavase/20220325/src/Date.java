/**
 * @Author : fourteen
 * @Description :
 * @Date : 2022/3/27 0:43
 */
public class Date {
    public int year;
    public int month;
    public int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate(){
        System.out.println(year + "-" + month + "-" + day);
    }
    public static void main(String[] args) {
        Date d = new Date(2022,3,26);
        d.printDate();
    }
}

