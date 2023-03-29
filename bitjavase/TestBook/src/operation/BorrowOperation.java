package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:20
 */
public class BorrowOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书!");
        System.out.println("请输入你要借阅图书的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }

        System.out.println("没有你要借阅的图书");
    }
}
