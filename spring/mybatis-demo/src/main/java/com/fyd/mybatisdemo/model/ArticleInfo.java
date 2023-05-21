package com.fyd.mybatisdemo.model;

import lombok.Data;

import java.util.Date;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 文章表的实体类
 * @DateTime: 2023/5/21 15:06
 */
@Data
public class ArticleInfo {
    private int id;
    private String title;
    private String content;
    private Date createTime;
    private Date updateTime;
    private int uid;
    // 访问量
    private int rcount;
    private int state;
}
