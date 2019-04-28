package com.cry.shop.service;

import com.cry.shop.entity.User;

public interface RegisterService {

    void AddUser(User user);

    int checkUser(User user);

}