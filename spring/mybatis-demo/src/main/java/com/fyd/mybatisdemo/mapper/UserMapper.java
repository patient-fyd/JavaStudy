package com.fyd.mybatisdemo.mapper;

import com.fyd.mybatisdemo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/20 22:51
 */
@Mapper
public interface UserMapper {
    /**
     *  查询所有的信息
     */
    public List<UserInfo> getAll();

    /**
     *  根据id查询用户信息
     */
    public UserInfo getUserById(@Param("uid") Integer id);
}
