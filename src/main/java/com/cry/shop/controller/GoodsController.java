package com.cry.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cry.shop.data.GetGoodsListResponse;
import com.cry.shop.entity.Goods;
import com.cry.shop.service.GoodsService;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping(value = "/getGoodsList")
    @ResponseBody
    public GetGoodsListResponse getGoodsList() {
        GetGoodsListResponse rsp = new GetGoodsListResponse();
        List < Goods > goodsList = goodsService.getGoodsList();
        rsp.setGoodsList(goodsList);
        return rsp;
    }
    
    @GetMapping(value = "/queryGoodsDetail")
    @ResponseBody
    public Goods queryGoodsDetail(Goods req) {
        Goods goods = goodsService.queryGoodsDetail(req);
        return goods;
    }
}
