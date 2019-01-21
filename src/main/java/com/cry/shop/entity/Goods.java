package com.cry.shop.entity;

public class Goods {
    private Integer id;

    private String goodsName;

    private String goodsPrice;

    private String mainPicture;

    private String detailPicture;

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
        builder.append("]");
        return builder.toString();
    }

}
