package com.fyd.mybatisdemo.model;

import lombok.Data;

import java.util.Date;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 普通的实体类，用于mybatis做数据库表的映射
 * @DateTime: 2023/5/20 22:54
 */
@Data
public class UserInfo {
    private int id;
    private String name;
    private String password;
    private String photo;
    private Date createTime;
    private Date updateTime;
    private int state;
}
