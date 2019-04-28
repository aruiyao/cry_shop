package com.cry.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cry.shop.entity.Goods;
import com.cry.shop.mapper.GoodsMapper;
import com.cry.shop.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List < Goods > getGoodsList(Goods req) {
        return goodsMapper.getGoodsList(req);
    }

    @Override
    public Goods queryGoodsDetail(Goods req) {
        return goodsMapper.queryGoodsDetail(req);
    }

}
