package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:22
 */
public class DelOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书!");

        System.out.println("请输入你要删除图书的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int index = 0;
        int currentSize = bookList.getUsedSize();
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (book.getName().equals(name)) {
                System.out.println(name + "已删除！");
                index = i;
                break;
            }
        }

        if (i == currentSize) {
            System.out.println("没有你要删除的书！");
            return;
        }

        for (int j = index; j < currentSize - 1; j++) {
            Book book = bookList.getPos(j + 1);

            BookList.setBooks(j,book);
        }

        BookList.setBooks(currentSize - 1,null);

        bookList.setUsedSize(currentSize - 1);
    }
}
