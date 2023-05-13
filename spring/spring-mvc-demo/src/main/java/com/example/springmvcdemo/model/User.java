package com.example.springmvcdemo.model;

import lombok.Data;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/14 2:30
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;
}
