package com.mjx.test;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/6/9 1:06
 */
public class Qingjia {
    private int id;

    private String sf;

    private String Personid;

    private int zhuangtai;

    private int numday;

    private static int tid;

    Qingjia(String sf,String Personid,int numday)

    {

        tid++;

        this.sf=sf;

        this.id=tid;

        this.Personid=Personid;

        this.zhuangtai=0;

        this.numday=numday;

    }

    public int getId() {

        return id;

    }

    public String getSf() {

        return sf;

    }

    public void setSf(String sf) {

        this.sf = sf;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getPersonid() {

        return Personid;

    }

    public void setPersonid(String personid) {

        Personid = personid;

    }

    public int getZhuangtai() {

        return zhuangtai;

    }

    public void setZhuangtai(int zhuangtai) {

        this.zhuangtai = zhuangtai;

    }

    public int getNumday() {

        return numday;

    }

    public void setNumday(int numday) {

        this.numday = numday;

    }
}
