package operation;

import book.Book;
import book.BookList;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:25
 */
public class ExitOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            BookList.setBooks(i,null);
        }

        System.exit(0);
    }
}
