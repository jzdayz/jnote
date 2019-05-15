package com.pes.jd.model.DTO;

import com.baomidou.mybatisplus.annotation.TableName;

public class ShopGoodsSkuAssociativeDTO {
    private Long id;

    private Long shopId;

    private Long sku1Id;

    private Long sku2Id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getSku1Id() {
        return sku1Id;
    }

    public void setSku1Id(Long sku1Id) {
        this.sku1Id = sku1Id;
    }

    public Long getSku2Id() {
        return sku2Id;
    }

    public void setSku2Id(Long sku2Id) {
        this.sku2Id = sku2Id;
    }
}