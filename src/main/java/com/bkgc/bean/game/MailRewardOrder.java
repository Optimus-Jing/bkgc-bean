package com.bkgc.bean.game;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

/**
 * Created by gmg on on 2018-01-03 16:57.
 */
@Data
public class MailRewardOrder extends PageParam {

    private String rewardName;
    private String realName;
    private String address;
    private String phone;
    private Date createTime;
    private String startDateTime;
    private String endDateTime;
    private String courier;
    private String mailNo;
    private String id;
    private Integer status;
    private String userId;
    private String rewardId;

}
