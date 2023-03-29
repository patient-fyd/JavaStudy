package user;

import book.BookList;
import operation.IOperation;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 15:37
 */
public abstract class User {
    protected String name;
    public IOperation[] ioPerations;


    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice,BookList bookList) {
        ioPerations[choice].work(bookList);
    }
}
