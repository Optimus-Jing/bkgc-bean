package com.bkgc.bean.game;

import lombok.Data;

@Data
public class RewardPool {
    private String id;

    private String rewardId;

    private Integer amount;

    private Integer remain;
}