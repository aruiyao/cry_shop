package com.cry.shop.service;

import java.util.List;

import com.cry.shop.entity.Goods;

public interface GoodsService {

    List < Goods > getGoodsList(Goods req);

    Goods queryGoodsDetail(Goods req);

}