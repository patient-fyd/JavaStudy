package book;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/4/18 14:56
 */
public class BookList {
    //这个书架的大小
    private static Book[] books = new Book[10];
    /**
     * 数组中放了几本书
     */
    private int usedSize;

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",34,"小说");
        books[1] = new Book("西游记","吴承恩",24,"小说");
        books[2] = new Book("红楼梦","曹雪芹",30,"小说");
        this.usedSize = 3;
    }

    /**
     * 获取当前数组中的元素个数
     * @return
     */
    public int getUsedSize() {
        return usedSize;
    }

    /**
     * 修改当前数组中元素个数
     * @param usedSize
     */
    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    //可以在这里面写所有对数组的操作：借书、还书

    /**
     * 获取pos下标的书
     * @param pos
     * @return
     */
    public Book getPos(int pos) {
        return books[pos];
    }

    /**
     * 给数组的pos位置，放一本书
     * @param pos
     * @param book
     */
    public static void setBooks(int pos, Book book) {
        books[pos] = book;
    }
}
