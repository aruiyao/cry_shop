package com.cry.shop.entity;

public class Goods {
    private Integer id;

    /**商品名称*/
    private String goodsName;

    /**商品价格*/
    private String goodsPrice;

    /**商品主图*/
    private String mainPicture;

    /**详情图片*/
    private String detailPicture;

    /**创建时间*/
    private String createTime;

    /**商品状态 0:下架  1：上架*/
    private String goodsStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture;
    }

    public String getDetailPicture() {
        return detailPicture;
    }

    public void setDetailPicture(String detailPicture) {
        this.detailPicture = detailPicture;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Goods [id=");
        builder.append(id);
        builder.append(", goodsName=");
        builder.append(goodsName);
        builder.append(", goodsPrice=");
        builder.append(goodsPrice);
        builder.append(", mainPicture=");
        builder.append(mainPicture);
        builder.append(", detailPicture=");
        builder.append(detailPicture);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append(", goodsStatus=");
        builder.append(goodsStatus);
        builder.append("]");
        return builder.toString();
    }

}
