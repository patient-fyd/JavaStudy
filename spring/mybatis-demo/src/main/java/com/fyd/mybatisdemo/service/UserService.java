package com.fyd.mybatisdemo.service;

import com.fyd.mybatisdemo.mapper.UserMapper;
import com.fyd.mybatisdemo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/22 9:40
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UserInfo> getAll() {
        List<UserInfo> userList = userMapper.getAll();
        return userList;
    }
}
