package com.example.biz.module1.entity;

import java.io.Serializable;

public class GinwaPromotionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer promotionId;
    private String logoUrl;
    private String brandName;
    private String name;
    private String content;
    private String startDate;
    private String endDate;
    private boolean hot;
    private String remarks;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "GinwaPromotionEntity{" +
                "promotionId=" + promotionId +
                ", logoUrl='" + logoUrl + '\'' +
                ", brandName='" + brandName + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", hot=" + hot +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
