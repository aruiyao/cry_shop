package com.cry.shop.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cry.shop.entity.User;
import com.cry.shop.service.RegisterService;

@Controller
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    /**   
     * @Title: 注册用户   
     * @Description: TODO(这里用一句话描述这个方法的作用)   
     * @param user
     * @param request      
     * @throws   
     */
    @PostMapping(value = "/register")
    @ResponseBody
    public void register(@RequestBody User user, HttpServletRequest request) {

        registerService.AddUser(user);
        HttpSession session = request.getSession();// 这就是session的创建
        session.setAttribute("userName", user.getUserName());
        session.setAttribute("id", user.getId());

    }

    /**   
     * @Title: 注册学号唯一性校验   
     * @Description: TODO(这里用一句话描述这个方法的作用)   
     * @param user
     * @return      
     * @throws   
     */
    @GetMapping(value = "/checkUser")
    @ResponseBody
    public Map < String, Boolean > checkUser(User user) {
        System.out.println(user);
        Map < String, Boolean > map = new HashMap < String, Boolean >();
        int isExist = registerService.checkUser(user);
        System.out.println("isExist=" + isExist);
        if (isExist == 0) {
            // 注册学号不存在
            map.put("valid", true);
        }
        else {
            // 注册学号已存在
            map.put("valid", false);
        }
        return map;
    }
}
