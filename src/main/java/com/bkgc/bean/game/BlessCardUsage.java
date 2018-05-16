package com.bkgc.bean.game;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BlessCardUsage {
    private String id;

    private String cardId;

    private BigDecimal blessAmount;

    private Date createTime;

    private String description;

    private String userId;

    private String rewardId;
}