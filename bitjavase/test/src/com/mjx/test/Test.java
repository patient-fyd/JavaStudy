package com.mjx.test;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/6/9 1:10
 */
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Qingjia> list=new ArrayList<Qingjia>();

        Student s1=new Student("ѧ��","0413170301","JOB", 19);

        s1.Qingjia("Student",list, 2);

        Student s2=new Student("ѧ��","0413170302","Bob", 19);

        s2.Qingjia("Student",list, 2);

        System.out.println(list.get(0).getId()+" "+list.get(0).getPersonid()+" "+list.get(0).getZhuangtai()+" "+list.get(0).getNumday());

        Teacher t1=new Teacher("��ʦ ","0123456","tot",27);

                t1.Qingjia("Teacher",list, 15);

        Leader l1=new Leader("�쵼","0147852","hub",20);

        //��ʦ����ѧ�����
        t1.PassQingjia(list);

        //ͬ��
        t1.PassQingjia(list);

        //�쵼������ʦ���
        l1.PassQingjia(list);

    }

}
