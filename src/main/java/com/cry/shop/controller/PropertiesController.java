package com.cry.shop.controller;

import java.util.Properties;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cry.shop.utils.PropertiesUtil;

@Controller
public class PropertiesController {
    @GetMapping("/getProperties")
    @ResponseBody
    public Properties getProperties() {
        Properties prop = PropertiesUtil.getReadAbleProperties("/application.properties");
        return prop;
    }
}
