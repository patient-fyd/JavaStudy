package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:26
 */
public class ReturnOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书!");

        System.out.println("请输入你要归还图书的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }

        System.out.println("没有你要归还的图书");
    }
}
