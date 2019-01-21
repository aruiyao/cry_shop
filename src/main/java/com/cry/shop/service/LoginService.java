package com.cry.shop.service;

import com.cry.shop.data.LoginRequset;
import com.cry.shop.entity.User;

public interface LoginService {

    User getAllUsers(LoginRequset req);

}