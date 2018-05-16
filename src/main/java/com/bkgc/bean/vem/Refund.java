package com.bkgc.bean.vem;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class Refund extends PageParam {
    private Integer id;

    private String orderNo;

    private Date startTime;

    private Date endTime;

    private Integer tradePrice;

    private Integer refundPrice;

    private String userName;

    private String errorId;

    private Integer isDelete;

    private String refundChannel;

    private String status;

    private String audit;

    private String errorDescription;

    private String refundId;

    private String openId;

    private String backup;

}