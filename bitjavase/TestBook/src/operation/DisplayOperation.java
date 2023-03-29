package operation;

import book.Book;
import book.BookList;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:23
 */
public class DisplayOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("展示图书!");


        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {

            Book book = bookList.getPos(i);
            System.out.println(book);
        }

    }
}
