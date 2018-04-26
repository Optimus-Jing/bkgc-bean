package com.bkgc.bean.order;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderNo;

    private String channelName;

    private Integer channelId;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private double totalPrice;

    private String payType;

    private String tradeStatus;

    private String shopStatus;

    private Integer machineId;

    private Integer storeId;

    private String secondChannelName;

    private String sceneName;

    private String storeName;

    private String storeAddress;

    private String thirdOrderNo;

    private Date tradeTime;

    private String payResult;

    private String errorId;

    private String errorDescription;

    private String openId;

    private String backup;

    private Integer productNum;

    private String productName;

    private String dateStr;

    private int thirdpaystatus;

    private int thirdpaymoney;

}