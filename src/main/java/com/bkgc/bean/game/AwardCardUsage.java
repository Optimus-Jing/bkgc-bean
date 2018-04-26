package com.bkgc.bean.game;

import lombok.Data;

import java.util.Date;

@Data
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

    public AwardCardUsage(String id, String cardId, String awardNo, Long awardAmount, Date createTime, String userId, String rewardId) {
        this.id = id;
        this.cardId = cardId;
        this.awardNo = awardNo;
        this.awardAmount = awardAmount;
        this.createTime = createTime;
        this.userId = userId;
        this.rewardId = rewardId;
    }
}