package user;

import operation.*;

import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:38
 */
public class AdminUser extends User{


    public AdminUser(String name) {
        super(name);

        this.ioPerations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("hello "+this.name+" 欢迎来到图书小练习");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;

    }
}
