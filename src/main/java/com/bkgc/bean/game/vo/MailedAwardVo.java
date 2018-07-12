package com.bkgc.bean.game.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class MailedAwardVo {
    private String id;

    private String cardId;

    private Date createTime;

    private String description;

    private String userId;

    private String courier;

    private String mailNo;

    private String rewardId;

    private Integer status;

    private String address;

    private String name;

    private String phone;

    /**
     * 邮寄日期
     */
    private String mailingDate;

}