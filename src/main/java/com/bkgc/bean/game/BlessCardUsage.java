package com.bkgc.bean.game;

import java.math.BigDecimal;
import java.util.Date;

public class BlessCardUsage {
    private String id;

    private String cardId;

    private BigDecimal blessAmount;

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

    public BigDecimal getBlessAmount() {
        return blessAmount;
    }

    public void setBlessAmount(BigDecimal blessAmount) {
        this.blessAmount = blessAmount;
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