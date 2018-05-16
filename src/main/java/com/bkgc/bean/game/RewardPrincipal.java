package com.bkgc.bean.game;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RewardPrincipal {
    private String id;

    private String rewardId;

    private String description;

    private String userId;

    private BigDecimal factorIndexMin;

    private BigDecimal factorIndexMax;

    private int available;

}