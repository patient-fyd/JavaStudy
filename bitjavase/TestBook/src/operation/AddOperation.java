package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:15
 */
public class AddOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书!");
        System.out.println("请输入图书的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入图书的作者");
        String author = sc.nextLine();
        System.out.println("请输入图书的类型");
        String type = sc.nextLine();
        System.out.println("请输入图书的价格");
        int price = sc.nextInt();


        Book book = new Book(name,author,price,type);

        int currentSize = bookList.getUsedSize();
        BookList.setBooks(currentSize,book);

        bookList.setUsedSize(currentSize + 1);

        System.out.println("新增成功！");
    }
}
