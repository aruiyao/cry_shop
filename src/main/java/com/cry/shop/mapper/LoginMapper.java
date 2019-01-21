package com.cry.shop.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cry.shop.data.LoginRequset;
import com.cry.shop.entity.User;

public interface LoginMapper {
	@Select("select * from t_users where user_name=#{req.user.userName}&&password=#{req.user.password}")
	public User getAllUsers(@Param("req") LoginRequset req);
}
