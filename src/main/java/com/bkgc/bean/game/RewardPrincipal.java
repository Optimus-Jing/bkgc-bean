package com.bkgc.bean.game;

import java.math.BigDecimal;

public class RewardPrincipal {
    private String id;

    private String rewardId;

    private String description;

    private String userId;

    private BigDecimal factorIndexMin;

    private BigDecimal factorIndexMax;

    private int available;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId == null ? null : rewardId.trim();
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

    public BigDecimal getFactorIndexMin() {
        return factorIndexMin;
    }

    public void setFactorIndexMin(BigDecimal factorIndexMin) {
        this.factorIndexMin = factorIndexMin;
    }

    public BigDecimal getFactorIndexMax() {
        return factorIndexMax;
    }

    public void setFactorIndexMax(BigDecimal factorIndexMax) {
        this.factorIndexMax = factorIndexMax;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
}