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
     *  查询所有的信息（根据排序条件排序）
     */
    public List<UserInfo> getAllOrder(@Param("order") String order);

    /**
     *  根据id查询用户信息
     */
    public UserInfo getUserById(@Param("uid") Integer id);

    /**
     * 根据用户姓名完全匹配查询
     */
    public UserInfo getUserByName(@Param("username") String username);

    public UserInfo login(@Param("username") String username, @Param("password") String password);

    /**
     * 模糊查询
     */
    public List<UserInfo> getUserByLikeName(@Param("username") String username);
}
