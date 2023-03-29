package com.test3;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/5/13 13:03
 */
public class FarmerToBridge {
    //试探下一个状态
    static int[] testState = new int[4];
    //记录目前的状态
    static int[] currentState = {0,0,0,0};
    //过河方法
    static int[][] method = {{1,1,0,0},{1,0,0,0},{1,0,1,0},{1,0,0,1}};

    /**
     * 一个驯兽师有一捆草，一只羊，一头老虎。
     * 他想把草，羊，老虎运过河。但是老虎要吃羊，羊要吃草。设计过河策略，标明每一趟谁过河，使得草，羊，和老虎均可安全过河。
     */
    public static void main(String[] args) {
        //都到达河岸为止
        while(currentState[0]+currentState[1]+currentState[2]+currentState[3]!=4) {
            //遍历下一个状态
            for(int i=0;i<4;i++) {
                //试探这个状态
                ChooseState(currentState,method[i]);
                //判断是否为安全状态
                if (IsSafeState(testState)) {
                    //展示这个状态
                    DisplayState();
                    //接收这个状态
                    AcceptState();
                    System.out.println("");
                }
            }
        }
        System.out.println("过河成功！");
    }

    public static void ChooseState(int currentState[],int method[]) {
        testState[0] = (currentState[0]+method[0])%2;
        testState[1] = (currentState[1]+method[1])%2;
        testState[2] = (currentState[2]+method[2])%2;
        testState[3] = (currentState[3]+method[3])%2;
    }

    public static Boolean IsSafeState(int testState[]) {
        if (State(testState)) { return true; }
        else { return false; }
    }

    public static Boolean State(int testState[]) {
        if (  (testState[0]==1 && testState[1]==1 && testState[2]==1 && testState[3]==1)
                ||(testState[0]==1 && testState[1]==1 && testState[2]==1 && testState[3]==0)
                ||(testState[0]==1 && testState[1]==1 && testState[2]==0 && testState[3]==1)
                ||(testState[0]==1 && testState[1]==0 && testState[2]==1 && testState[3]==1)
                ||(testState[0]==1 && testState[1]==0 && testState[2]==1 && testState[3]==0)
                ||(testState[0]==0 && testState[1]==0 && testState[2]==0 && testState[3]==0)
                ||(testState[0]==0 && testState[1]==0 && testState[2]==0 && testState[3]==1)
                ||(testState[0]==0 && testState[1]==0 && testState[2]==1 && testState[3]==0)
                ||(testState[0]==0 && testState[1]==1 && testState[2]==0 && testState[3]==0)
                ||(testState[0]==0 && testState[1]==1 && testState[2]==0 && testState[3]==1)
        ) {
            return true;
        }else {
            return false;
        }
    }

    public static void DisplayState() {
        if(testState[0]==1) {
            System.out.print("河南-->河北：");
        }else {
            System.out.print("河北-->河南：");
        }
        if (testState[0] != currentState[0]) {
            System.out.print("人");
        }
        if (testState[1] != currentState[1]) {
            System.out.print("带狼");
        }
        if (testState[2] != currentState[2]) {
            System.out.print("带羊");
        }
        if (testState[3] != currentState[3]) {
            System.out.print("带白菜");
        }
        System.out.print("过河");

    }

    public static void AcceptState() {
        for(int j=0;j<4;j++) {
            currentState[j] = testState[j];
        }
    }
}
