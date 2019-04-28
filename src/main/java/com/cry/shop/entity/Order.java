package com.cry.shop.entity;

/**
 * 订单实体类
 * @author CRY
 *
 */
public class Order {
    /**订单id*/
    private Integer id;
    /**用户id*/
    private Integer userId;
    /**用户学号*/
    private String userName;
    /**商品id*/
    private Integer goodsId;
    /**商品名称*/
    private String goodsName;
    /**商品主图*/
    private String mainPicture;
    /**收货地址*/
    private String address;
    /**买家留言*/
    private String leaveWord;
    /**购买数量*/
    private Integer number;
    /**订单总额*/
    private String totalPrice;
    /**订单创建时间*/
    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Order [id=");
        builder.append(id);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", userName=");
        builder.append(userName);
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
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append("]");
        return builder.toString();
    }

}
