package com.cry.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cry.shop.entity.User;
import com.cry.shop.service.RegisterService;

@Controller
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping(value = "/register")
    @ResponseBody
    public void register(@RequestBody User user, HttpServletRequest request) {

        registerService.AddUser(user);
        HttpSession session = request.getSession();// 这就是session的创建
        session.setAttribute("userName", user.getUserName());
        session.setAttribute("id", user.getId());

    }
}
