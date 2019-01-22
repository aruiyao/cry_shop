package com.cry.shop.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.cry.shop.entity.Order;

public interface OrderMapper {
    @Insert("insert into t_order (goods_id,goods_name,main_picture,address,leave_word,number,total_price) values (#{goodsId},#{goodsName},#{mainPicture},#{address},#{leaveWord},#{number},#{totalPrice})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void createOrder(Order order);

}
