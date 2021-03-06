package com.bkgc.bean.game;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class MailedAward {
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
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date mailingDate;

}