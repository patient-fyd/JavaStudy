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

        Student s1=new Student("学生","0413170301","JOB", 19);

        s1.Qingjia("Student",list, 2);

        Student s2=new Student("学生","0413170302","Bob", 19);

        s2.Qingjia("Student",list, 2);

        System.out.println(list.get(0).getId()+" "+list.get(0).getPersonid()+" "+list.get(0).getZhuangtai()+" "+list.get(0).getNumday());

        Teacher t1=new Teacher("老师 ","0123456","tot",27);

                t1.Qingjia("Teacher",list, 15);

        Leader l1=new Leader("领导","0147852","hub",20);

        //老师审批学生请假
        t1.PassQingjia(list);

        //同上
        t1.PassQingjia(list);

        //领导审批老师请假
        l1.PassQingjia(list);

    }

}
