package com.mjx.test;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/6/9 1:07
 */
import java.util.ArrayList;

public class Student extends Person {

    Student(String sf, String id, String name, int age) {

        super(sf, id, name, age);

        // TODO Auto-generated constructor stub

    }

    public void Qingjia(String sf1,ArrayList<Qingjia> list,int n)

    {

        Qingjia qj=new Qingjia(sf1,this.getId(),n);

        list.add(qj);

    }

}
