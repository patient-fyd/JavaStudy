package com.mjx.test;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/6/9 1:08
 */
import java.util.ArrayList;

import java.util.Scanner;

public class Teacher extends Person{

    Teacher(String sf, String id, String name, int age) {

        super(sf, id, name, age);

        // TODO Auto-generated constructor stub

    }

    public int PassQingjia(ArrayList<Qingjia> list) {

        int a=0;

        System.out.println("���������£�");

        for(int i=0;i<list.size();i++) {

            System.out.println(list.get(i).getId()+" "+list.get(i).getSf()+" "+list.get(i).getPersonid()+"�������"+list.get(i).getNumday()+"ͬ��״̬ "+list.get(i).getZhuangtai());

        }

        System.out.println("���");

        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<list.size();i++) {

            if (list.get(i).getId()==n) {
                list.get(i).setZhuangtai(1);
            }

            if (list.get(i).getId()==0) {
                a++;
            }
        }

        for(int i=0;i<list.size();i++) {

            System.out.println(list.get(i).getId()+" "+list.get(i).getSf()+" "+list.get(i).getPersonid()+"�������"+list.get(i).getNumday()+"���״̬"+list.get(i).getZhuangtai());

        }

        return a;

    }

    public void Qingjia(String sf1,ArrayList<Qingjia> list,int n)

    {

        Qingjia qj=new Qingjia(sf1,this.getId(),n);

        list.add(qj);

    }

}
