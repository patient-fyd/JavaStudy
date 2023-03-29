package user;

import operation.*;

import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:38
 */
public class NormalUser extends User{

    public NormalUser(String name) {
        super(name);
        this.ioPerations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("hello "+this.name+" 欢迎来到图书小练习");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("请输入你的操作：");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;

    }


}
