package com.fyd.mybatisdemo.mapper;

import com.fyd.mybatisdemo.model.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/20 23:49
 */
@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void getAll() {
        List<UserInfo> userInfos = userMapper.getAll();
        for (UserInfo userInfo : userInfos) {
            System.out.println(userInfo.toString());
        }
    }

    @Test
    void getUserById() {
        UserInfo userInfo = userMapper.getUserById(1);
        System.out.println(userInfo.toString());
    }

    @Test
    void getUserByName() {
        UserInfo userInfo = userMapper.getUserByName("admin");
        System.out.println(userInfo.toString());
    }
}