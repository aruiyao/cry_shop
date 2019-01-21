package com.cry.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cry.shop.entity.User;
import com.cry.shop.mapper.RegisterMapper;
import com.cry.shop.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public void AddUser(User user) {
        registerMapper.AddUser(user);
    }
}
