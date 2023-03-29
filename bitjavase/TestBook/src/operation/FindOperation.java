package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:26
 */
public class FindOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书!");
        System.out.println("请输入你要查找图书的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (book.getName().equals(name)) {
                System.out.println("找到这本书了，信息如下");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书！");

    }
}
