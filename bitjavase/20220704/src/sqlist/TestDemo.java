package sqlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/7 16:25
 */
public class TestDemo {

    public static List<Character> func(String s1,String s2) {
        ArrayList<Character> ret = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(!s2.contains(ch + " ")) {
                ret.add(ch);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String s1 = "welcome to bit";
        String s2 = "come";
        List<Character> ret = func(s1,s2);
        for (char ch:ret) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main11(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,19);
        arrayList.add(2,199);

        System.out.println(arrayList);

        arrayList.remove(new Integer(19));

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        arrayList2.add(99);
        arrayList2.add(99);
        arrayList2.add(99);

        System.out.println(arrayList2);
        int index = arrayList2.lastIndexOf(new Integer(99));
        System.out.println(index);

        //迭代器打印
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        //范围是左闭右开的
        //是在本身上截取的，改变截取的元素，原来的也会改变
        List<Integer> list = arrayList2.subList(1,3);
        System.out.println(list);

        //使用迭代器



    }

    public static void main2(String[] args) {
        //当调用这个构造方法的时候，这个数组的默认大小为0
        ArrayList<Integer> arrayList = new ArrayList<>();
        //往数组最后一个位置存元素
        //第一次add的时候，我们底层的数组才变成了10
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        //获取当前的有效数据的个数
        System.out.println(arrayList.size());
        //返回下标是1的元素
        System.out.println(arrayList.get(1));
        System.out.println("++++++++++++分隔符++++++++++++");
        //使用其他的集合来构造当前的list
        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);
        arrayList2.add(199);
        arrayList2.add(299);
        System.out.println(arrayList2);

        //指定数组的容量为15
        ArrayList<Integer> arrayList3 = new ArrayList<>(15);



    }
    public static void main1(String[] args) {
        MyArraylist myArraylist = new MyArraylist();
        /*myArraylist.add(0,1);
        myArraylist.add(1,2);
        myArraylist.add(2,3);
        myArraylist.add(3,4);
        myArraylist.add(4,5);
        myArraylist.add(2,999);
        myArraylist.display();*/
        System.out.println("========================");
        int ret = myArraylist.get(2);
        System.out.println(ret);
    }
}
