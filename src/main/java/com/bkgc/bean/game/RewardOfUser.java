package com.bkgc.bean.game;

import lombok.Data;

import java.util.Date;

@Data
public class RewardOfUser {
    private String id;

    private String rewardId;

    private String userId;

    private Date gainedTime;

    private Integer status;

    private Date expired;

    private Integer pagestart;

    private Integer pageLimit;

    private String rewardCode;

    private Integer flag;

    //快递单号
    private String mailNo;

    //快递公司
    private String courier;

    private String rewardName;

    private String rewardType;

    public RewardOfUser() {
    }
}