package com.pes.jd.model.DO;

public class PesMenuResource {
    private Long id;

    private String title;

    private String name;

    private Integer sort;

    private Integer parentId;

    private String note;

    private Boolean isDefault;

    private Boolean isPersonalData;

    private Boolean isCsTeamData;

    private Boolean isShopData;

    private Boolean isShopMultipleData;

    private Integer shopId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsPersonalData() {
        return isPersonalData;
    }

    public void setIsPersonalData(Boolean isPersonalData) {
        this.isPersonalData = isPersonalData;
    }

    public Boolean getIsCsTeamData() {
        return isCsTeamData;
    }

    public void setIsCsTeamData(Boolean isCsTeamData) {
        this.isCsTeamData = isCsTeamData;
    }

    public Boolean getIsShopData() {
        return isShopData;
    }

    public void setIsShopData(Boolean isShopData) {
        this.isShopData = isShopData;
    }

    public Boolean getIsShopMultipleData() {
        return isShopMultipleData;
    }

    public void setIsShopMultipleData(Boolean isShopMultipleData) {
        this.isShopMultipleData = isShopMultipleData;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}