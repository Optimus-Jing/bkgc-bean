package com.bkgc.bean.game;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RewardFactor {
    private String userId;

    private BigDecimal purchesLotteryAmount;

    private BigDecimal awardAmount;

    private Integer gameTimes;

    private Integer luckyValue;

    private Integer luckySum;

    private Integer luckyNumber;

    private BigDecimal gameRewardPrice;

    private Integer sharingGameTimes;

}