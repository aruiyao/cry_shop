package com.cry.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cry.shop.entity.Order;
import com.cry.shop.service.OrderService;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**   
     * @Title: 创建订单   
     * @Description: TODO(这里用一句话描述这个方法的作用)   
     * @param order
     * @return      
     * @throws   
     */
    @RequestMapping(value = "/createOrder")
    @ResponseBody
    public Order createOrder(@RequestBody Order order) {

        orderService.createOrder(order);
        return order;

    }

}
