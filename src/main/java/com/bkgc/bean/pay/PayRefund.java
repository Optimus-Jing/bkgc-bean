package com.bkgc.bean.pay;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PayRefund {
    private String id;

    private String refundAuditId;

    private String payInfoId;

    private String orderNo;

    private BigDecimal refundAmount;

    private Integer refundPayType;

    private String refundAccount;

    private String refundReason;

    private Integer refundStatus;

    private String failReason;

    private String userId;

    private Date refundTime;

}