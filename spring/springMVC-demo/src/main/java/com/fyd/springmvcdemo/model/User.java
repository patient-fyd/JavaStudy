package com.fyd.springmvcdemo.model;

import lombok.Data;

/**
* @Author: patient.fyd@gmail.com
* @Description: 
* @DateTime: 2023/8/27 8:06
*/
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
