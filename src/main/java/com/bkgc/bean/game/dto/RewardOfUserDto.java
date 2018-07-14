package com.bkgc.bean.game.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RewardOfUserDto {
    private String id;

    private String rewardId;

    private String userId;

    private Date gainedTime;

    private Integer status;

    private Date expired;

    private String rewardCode;

    private String rewardName;

    private String rewardType;

    /**
     * 使用时间
     */
    private Date useTime;

}