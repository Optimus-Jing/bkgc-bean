package com.bkgc.bean.game;

import java.util.Date;

public class AwardCardUsage {
    private String id;

    private String cardId;

    private String awardNo;

    private Long awardAmount;

    private Long multipleAmount;

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

    public String getAwardNo() {
        return awardNo;
    }

    public void setAwardNo(String awardNo) {
        this.awardNo = awardNo == null ? null : awardNo.trim();
    }

    public Long getAwardAmount() {
        return awardAmount;
    }

    public void setAwardAmount(Long awardAmount) {
        this.awardAmount = awardAmount;
    }

    public Long getMultipleAmount() {
        return multipleAmount;
    }

    public void setMultipleAmount(Long multipleAmount) {
        this.multipleAmount = multipleAmount;
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

    public AwardCardUsage(String id, String cardId, String awardNo, Long awardAmount, Date createTime, String userId, String rewardId) {
        this.id = id;
        this.cardId = cardId;
        this.awardNo = awardNo;
        this.awardAmount = awardAmount;
        this.createTime = createTime;
        this.userId = userId;
        this.rewardId = rewardId;
    }

    public AwardCardUsage() {
    }
}