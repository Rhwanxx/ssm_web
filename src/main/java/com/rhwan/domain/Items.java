package com.rhwan.domain;

import java.math.BigDecimal;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/11/14 18:04
 */
public class Items {

    //主键
    private Integer id;

    //项目名称
    private String itemName;

    //项目价格
    private BigDecimal itemPrice;

    //项目图片
    private String itemPic;

    //备注
    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemPic() {
        return itemPic;
    }

    public void setItemPic(String itemPic) {
        this.itemPic = itemPic;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemPic='" + itemPic + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
