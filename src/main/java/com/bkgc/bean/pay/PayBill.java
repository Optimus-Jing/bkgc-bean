package com.bkgc.bean.pay;

import lombok.Data;

import java.util.Date;

@Data
public class PayBill {
    private Integer id;

    private String orderNo;

    private String thirdOrderNo;

    private String mchId;

    private String payType;

    private Integer totalPrice;

    private Date tradeTime;

    private String tradeStatus;

    private String shopStatus;

    private String openId;

    private String errorId;

    private String errorDescription;

    private String payResult;

    private Integer machineId;

    private String backup;

}