package com.cry.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cry.shop.data.GetGoodsListResponse;
import com.cry.shop.entity.Goods;
import com.cry.shop.service.GoodsService;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**   
     * @Title: 查询商品列表   
     * @Description: TODO(这里用一句话描述这个方法的作用)   
     * @param req
     * @return      
     * @throws   
     */
    @GetMapping(value = "/getGoodsList")
    @ResponseBody
    public GetGoodsListResponse getGoodsList(Goods req) {
        GetGoodsListResponse rsp = new GetGoodsListResponse();
        List < Goods > goodsList = goodsService.getGoodsList(req);
        rsp.setGoodsList(goodsList);
        return rsp;
    }
    
    /**   
     * @Title: 根据商品ID查询商品详情   
     * @Description: TODO(这里用一句话描述这个方法的作用)   
     * @param req
     * @return      
     * @throws   
     */
    @GetMapping(value = "/queryGoodsDetail")
    @ResponseBody
    public Goods queryGoodsDetail(Goods req) {
        Goods goods = goodsService.queryGoodsDetail(req);
        return goods;
    }
}
