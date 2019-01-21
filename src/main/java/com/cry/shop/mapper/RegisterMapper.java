package com.cry.shop.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.cry.shop.entity.User;

public interface RegisterMapper {
    @Insert("insert into t_users(user_name, password) values(#{user.userName}, #{user.password})")
    @Options(useGeneratedKeys = true, keyProperty = "user.id")
    public void AddUser(@Param("user") User user);
}
