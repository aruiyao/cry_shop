package com.cry.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cry.shop.entity.Order;
import com.cry.shop.mapper.OrderMapper;
import com.cry.shop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    
    @Override
    public void createOrder(Order order) {
        orderMapper.createOrder(order);
    }

}
