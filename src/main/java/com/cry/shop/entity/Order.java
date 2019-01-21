package com.cry.shop.entity;

public class Order {
    private Integer id;

    private Goods goods;

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

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
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
        builder.append(", goods=");
        builder.append(goods);
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
