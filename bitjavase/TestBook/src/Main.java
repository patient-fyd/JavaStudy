import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;
import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:51
 */
public class Main {

    public static User login() {
        System.out.println("请输入姓名： ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入你的身份：——> 1、管理员，0、普通用户");
        int choice = sc.nextInt();
        if(choice == 1) {
           return new AdminUser(name);
        } else {
           return new NormalUser(name);
        }
    }
    public static void main(String[] args) {

        BookList bookList = new BookList();
        //需要看user到底引用了哪个对象
        User user = login();

        while (true) {
            //user引用了哪个对象？
            //选择了1之后，调用的是user引用的对象的具体操作，这个怎么做？？
            int choice = user.menu();

            user.doOperation(choice,bookList);

        }
    }
}
