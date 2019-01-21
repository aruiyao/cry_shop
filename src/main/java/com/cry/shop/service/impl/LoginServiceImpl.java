package com.cry.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cry.shop.data.LoginRequset;
import com.cry.shop.entity.User;
import com.cry.shop.mapper.LoginMapper;
import com.cry.shop.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public User getAllUsers(LoginRequset req){
		return loginMapper.getAllUsers(req);
	}
}
