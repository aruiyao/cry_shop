package com.cry.shop.entity;

public class Order {
    private Integer id;

    private Integer goodsId;

    private String goodsName;

    private String mainPicture;

    private String address;

    private String leaveWord;

    private Integer number;

    private String totalPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLeaveWord() {
        return leaveWord;
    }

    public void setLeaveWord(String leaveWord) {
        this.leaveWord = leaveWord;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Order [id=");
        builder.append(id);
        builder.append(", goodsId=");
        builder.append(goodsId);
        builder.append(", goodsName=");
        builder.append(goodsName);
        builder.append(", mainPicture=");
        builder.append(mainPicture);
        builder.append(", address=");
        builder.append(address);
        builder.append(", leaveWord=");
        builder.append(leaveWord);
        builder.append(", number=");
        builder.append(number);
        builder.append(", totalPrice=");
        builder.append(totalPrice);
        builder.append("]");
        return builder.toString();
    }

}
