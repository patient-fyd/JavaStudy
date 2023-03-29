package sqlist;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/7 16:24
 */
public class MyArrayListEmptyException extends RuntimeException{
    public MyArrayListEmptyException() {

    }

    public MyArrayListEmptyException(String message) {
        super(message);
    }
}
