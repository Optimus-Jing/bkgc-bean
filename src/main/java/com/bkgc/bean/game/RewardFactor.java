package com.bkgc.bean.game;

import java.math.BigDecimal;

public class RewardFactor {
    private String userId;

    private BigDecimal purchesLotteryAmount;

    private BigDecimal awardAmount;

    private Integer gameTimes;
    
    private Integer luckyValue;

    private BigDecimal gameRewardPrice;

    private Integer sharingGameTimes;

    public Integer getLuckyValue() {
        return luckyValue;
    }

    public void setLuckyValue(Integer luckyValue) {
    	this.luckyValue = luckyValue;
    }
    
    public String getUserId() {
    	return userId;
    }
    
    public void setUserId(String userId) {
    	this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getPurchesLotteryAmount() {
        return purchesLotteryAmount;
    }

    public void setPurchesLotteryAmount(BigDecimal purchesLotteryAmount) {
        this.purchesLotteryAmount = purchesLotteryAmount;
    }

    public BigDecimal getAwardAmount() {
        return awardAmount;
    }

    public void setAwardAmount(BigDecimal awardAmount) {
        this.awardAmount = awardAmount;
    }

    public Integer getGameTimes() {
        return gameTimes;
    }

    public void setGameTimes(Integer gameTimes) {
        this.gameTimes = gameTimes;
    }

    public BigDecimal getGameRewardPrice() {
        return gameRewardPrice;
    }

    public void setGameRewardPrice(BigDecimal gameRewardPrice) {
        this.gameRewardPrice = gameRewardPrice;
    }

    public Integer getSharingGameTimes() {
        return sharingGameTimes;
    }

    public void setSharingGameTimes(Integer sharingGameTimes) {
        this.sharingGameTimes = sharingGameTimes;
    }
}