package com.fourteen.demo1;

/**
 * @Author:
 * @Description:
 * @Date: 2022/4/15 16:59
 */
class B {
    public B() {
        func();
    }
    public void func() {
        System.out.println("B.func()");
    }
}
class D extends B {
    D() {
        super();
    }
    @Override
    public void func() {
        System.out.println("D.func() ");
    }
}
public class Test {
    public static void main(String[] args) {
        D d = new D();
    }
}
