package com.bkgc.bean.game;

import lombok.Data;

import java.util.Date;

@Data
public class DiscountCardUsage {
    private String id;

    private String cardId;

    private String discountOrderNo;

    private Long discountOrderOriginalAmount;

    private Long discountAmount;

    private Integer payStatus;

    private Date createTime;

    private String description;

    private String userId;

    private String rewardId;
}