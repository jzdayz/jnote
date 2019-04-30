package com.pes.jd.model.DO;

import java.util.Date;

public class CsTypeDay {

    private Long id;

    private Long shopId;

    private Date date;

    private String csNick;

    private Byte csType;

    private Boolean isLock;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCsNick() {
        return csNick;
    }

    public void setCsNick(String csNick) {
        this.csNick = csNick == null ? null : csNick.trim();
    }

    public Byte getCsType() {
        return csType;
    }

    public void setCsType(Byte csType) {
        this.csType = csType;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }
}