package sqlist;

import java.util.Arrays;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/7/6 23:02
 */
public class MyArraylist {
    public  int[] elem;
    public  int usedSize;
    private static final int DEFAULT_SIZE = 8;

    public MyArraylist() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表
     * 根据usedSide即可
     */
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i] + " ");
        }
        System.out.println();
    }


    /**
     * 新增元素,默认在数组最后新增
     *
     * @param data
     */
    public void add(int data) {
        //1、判断是否是满的
        if(this.isFull()){
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //2、不满进行插入
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    /**
     * 判断当前的顺序表是不是满的
     * @return ture:满  false:代表空
     */
    public boolean isFull() {
        if(this.usedSize == this.elem.length){
            return true;
        }
        return false;
    }

    private boolean checkPosInAdd(int pos){
        if(pos < 0 || pos >this.usedSize){
            System.out.println("pos位置不合法");
            return false;
        }
        return true;
    }


    /**
     * 在 pos 位置新增元素
     * pos位置必须判断合法性
     * 判断顺序表是否满
     * @param pos
     * @param data
     */
    public void add(int pos, int data) {
        //判断下标是否是合法的
        if(!checkPosInAdd(pos)){
            throw new MyArrayListIndexOutOfException("添加的位置不合法");
        }
        //判断是否是满的
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //挪数据
        for (int i = this.usedSize-1; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        //挪完了数据
        this.elem[pos] = data;
        this.usedSize++;
    }

    /**
     * 判定是否包含某个元素
     * @param toFind
     * @return
     */
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }


    /**
     * 查找某个元素对应的位置
     * @param toFind
     * @return
     */
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    private boolean checkPosInGet(int pos) {
        if(pos < 0 || pos >= this.usedSize) {
            System.out.println("pos位置不合法");
            return false;
        }
        return true;
    }

    /**
     * 获取 pos 位置的元素
     * @param pos
     * @return
     */
    public int get(int pos) {
        if(!checkPosInGet(pos)) {
            throw new MyArrayListIndexOutOfException("获取pos下标时，位置不合法");
        }
        //不用写判断空不空 没有问题的
        if(isEmpty()) {
            throw new MyArrayListEmptyException("获取元素的时候，顺序表为空！");
        }
        return this.elem[pos];
    }

    private boolean isEmpty() {
        return this.usedSize == 0;
    }


    /**
     * 给 pos 位置的元素设为 value
     * @param pos
     * @param value
     */
    public void set(int pos, int value) {
        if(!checkPosInGet(pos)){
            throw new MyArrayListIndexOutOfException("更新pos下标的元素，位置不合法");
        }
        if(isEmpty()){
            throw new MyArrayListEmptyException("顺序表为空！");
        }
        this.elem[pos] = value;
    }

    /**
     * 删除第一次出现的关键字key
     * @param key
     */
    public void remove(int key) {
        if(isEmpty()){
            System.out.println("顺序表为空，无法删除");
        }
        int index = indexOf(key);
        if(index == -1){
            System.out.println("没有找到你要删除的数值");
            return;
        }
        for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    /**
     * 获取顺序表长度
     * @return
     */
    public int size() {
        return this.usedSize;
    }

    /**
     * 清空顺序表
     */
    public void clear() {
        this.usedSize = 0;
    }

}
