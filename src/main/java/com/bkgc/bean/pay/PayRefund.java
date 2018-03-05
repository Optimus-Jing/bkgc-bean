package com.bkgc.bean.pay;

import java.math.BigDecimal;
import java.util.Date;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRefundAuditId() {
        return refundAuditId;
    }

    public void setRefundAuditId(String refundAuditId) {
        this.refundAuditId = refundAuditId == null ? null : refundAuditId.trim();
    }

    public String getPayInfoId() {
        return payInfoId;
    }

    public void setPayInfoId(String payInfoId) {
        this.payInfoId = payInfoId == null ? null : payInfoId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getRefundPayType() {
        return refundPayType;
    }

    public void setRefundPayType(Integer refundPayType) {
        this.refundPayType = refundPayType;
    }

    public String getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount == null ? null : refundAccount.trim();
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }
}