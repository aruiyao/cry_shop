package com.cry.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cry.shop.entity.Goods;

public interface GoodsMapper {
    
    @Select("select * from t_goods")
    public List<Goods> getGoodsList();
    
    @Select("select * from t_goods where id=#{id}")
    public Goods queryGoodsDetail(Goods req);

}
