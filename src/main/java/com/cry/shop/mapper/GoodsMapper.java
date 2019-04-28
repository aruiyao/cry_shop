package com.cry.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cry.shop.entity.Goods;

public interface GoodsMapper {
    @Select({
        "<script>",
        "select * from t_goods where 1=1",
        "<if test='id!=null and id!=\"\"'>",
        "and id=#{id}",
        "</if>",
        "<if test='goodsName!=null and goodsName!=\"\"'>", 
        "and goods_name like CONCAT(CONCAT('%', #{goodsName}), '%');", 
        "</if>",
        "<if test='goodsStatus!=null and goodsStatus!=\"\"'>",
        "and goods_status=#{goodsStatus}",
        "</if>",
        "order by create_time desc",
        "</script>" 
    }) 
    public List < Goods > getGoodsList(Goods req);

    
    @Select("select * from t_goods where id=#{id}")
    public Goods queryGoodsDetail(Goods req);

}
