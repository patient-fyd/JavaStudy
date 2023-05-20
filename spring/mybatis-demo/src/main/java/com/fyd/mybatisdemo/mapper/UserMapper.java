package com.fyd.mybatisdemo.mapper;

import com.fyd.mybatisdemo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/5/20 22:51
 */
@Mapper
public interface UserMapper {
    public List<UserInfo> getAll();
}
