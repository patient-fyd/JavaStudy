package com.bit.demo1;

import com.bit.demo2.TestDemo1;

/**
 * @Author : fourteen
 * @Description :
 * @Date : 2022/3/27 23:09
 */
public class TestDemo {
    /**
     * 成员变量 默认权限，包访问权限——>只能在当前包当中类使用
     */
    int a = 199;

    public int b = 888;
    /**
     * 只能在当前类中使用
     */
    private int c = 777;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void func(){
        TestDemo testDemo = new TestDemo();
        System.out.println(testDemo.a);
    }

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        System.out.println(testDemo.a);
    }
    public static void main1(String[] args) {
        TestDemo1 testDemo1 = new TestDemo1();
        System.out.println(testDemo1);
    }
}
