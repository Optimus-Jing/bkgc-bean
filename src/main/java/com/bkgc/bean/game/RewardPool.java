package com.bkgc.bean.game;

import lombok.Data;

@Data
public class RewardPool {
    private String id;

    private String rewardId;

    private String rewardName;

    private Integer amount;

    private Integer remain;

    private Integer state;

    private Integer rewardPoolNum;
}