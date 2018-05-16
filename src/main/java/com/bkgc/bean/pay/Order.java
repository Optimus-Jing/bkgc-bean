package com.bkgc.bean.pay;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Integer id;

    private String orderNo;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private Integer totalPrice;

    private String payType;

    private String tradeStatus;

    private String shopStatus;

    private Integer machineId;

    private Integer storeId;

    private String secondChannelName;

    private String sceneName;

    private String storeName;

    private String storeAddress;

    private String mchId;

    private String thirdOrderNo;

    private Date tradeTime;

    private String payResult;

    private String errorId;

    private String errorDescription;

    private String openId;

    private String backup;
}