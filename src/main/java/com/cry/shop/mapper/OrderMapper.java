package com.cry.shop.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.cry.shop.entity.Order;

public interface OrderMapper {
    @Insert({
        "insert into t_order (goods_id,user_id,user_name,goods_name,main_picture,address,leave_word,number,total_price,create_time) values (#{goodsId},#{userId},#{userName},#{goodsName},#{mainPicture},#{address},#{leaveWord},#{number},#{totalPrice},#{createTime})"
    })
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void createOrder(Order order);

}
