/**
 * 
 */
package com.cry.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cry.shop.data.LoginRequset;
import com.cry.shop.entity.User;
import com.cry.shop.service.LoginService;

/**
 * @author CRY
 *
 */
@Controller
public class LoginControlle {
    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/login")
    @ResponseBody
    public User login(@RequestBody LoginRequset req, HttpServletRequest request) {

        User user = loginService.getAllUsers(req);
        if (user == null) {
            user = new User();
        }
        HttpSession session = request.getSession();// 这就是session的创建
        session.setAttribute("userName", user.getUserName());
        session.setAttribute("id", user.getId());

        return user;
    }

    @GetMapping(value = "/logout")
    @ResponseBody
    public void logout(HttpServletRequest request) {
        HttpSession session = request.getSession();// 这就是session的创建
        session.invalidate();
    }

    @GetMapping(value = "/getUserInfo")
    @ResponseBody
    public User getUserInfo(HttpServletRequest request) {
        User user = new User();
        HttpSession session = request.getSession();// 这就是session的创建
        String userName = (String) session.getAttribute("userName");
        Integer id = (Integer) session.getAttribute("id");
        user.setUserName(userName);
        user.setId(id);
        return user;
    }

}
