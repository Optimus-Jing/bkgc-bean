package com.bkgc.bean.game;

import java.util.Date;

public class DiscountCardUsage {
    private String id;

    private String cardId;

    private String discountOrderNo;

    private Long discountOrderOriginalAmount;

    private Long discountAmount;

    private Integer payStatus;

    private Date createTime;

    private String description;

    private String userId;

    private String rewardId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getDiscountOrderNo() {
        return discountOrderNo;
    }

    public void setDiscountOrderNo(String discountOrderNo) {
        this.discountOrderNo = discountOrderNo == null ? null : discountOrderNo.trim();
    }

    public Long getDiscountOrderOriginalAmount() {
        return discountOrderOriginalAmount;
    }

    public void setDiscountOrderOriginalAmount(Long discountOrderOriginalAmount) {
        this.discountOrderOriginalAmount = discountOrderOriginalAmount;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId == null ? null : rewardId.trim();
    }
}