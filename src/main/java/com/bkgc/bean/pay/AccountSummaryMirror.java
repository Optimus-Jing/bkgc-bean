package com.bkgc.bean.pay;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yanqiang on 2017/11/29.
 */
public class AccountSummaryMirror {


    private String id;

    private Date timeOfData;

    private BigDecimal pBlessAccount;

    private BigDecimal pWithdrawAmount;

    private BigDecimal eBlessAccount;

    private BigDecimal eWithdrawAmount;

    private BigDecimal rBlessAccount;

    private BigDecimal rWithdrawAmount;

    private Date mirrorTime;

    public AccountSummaryMirror() {
        super();
    }

    public AccountSummaryMirror(Date date) {
        this();
        this.setTimeOfData(date);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimeOfData() {
        return timeOfData;
    }

    public void setTimeOfData(Date timeOfData) {
        this.timeOfData = timeOfData;
    }

    public BigDecimal getpBlessAccount() {
        return pBlessAccount;
    }

    public void setpBlessAccount(BigDecimal pBlessAccount) {
        this.pBlessAccount = pBlessAccount;
    }

    public BigDecimal getpWithdrawAmount() {
        return pWithdrawAmount;
    }

    public void setpWithdrawAmount(BigDecimal pWithdrawAmount) {
        this.pWithdrawAmount = pWithdrawAmount;
    }

    public BigDecimal geteBlessAccount() {
        return eBlessAccount;
    }

    public void seteBlessAccount(BigDecimal eBlessAccount) {
        this.eBlessAccount = eBlessAccount;
    }

    public BigDecimal geteWithdrawAmount() {
        return eWithdrawAmount;
    }

    public void seteWithdrawAmount(BigDecimal eWithdrawAmount) {
        this.eWithdrawAmount = eWithdrawAmount;
    }

    public BigDecimal getrBlessAccount() {
        return rBlessAccount;
    }

    public void setrBlessAccount(BigDecimal rBlessAccount) {
        this.rBlessAccount = rBlessAccount;
    }

    public BigDecimal getrWithdrawAmount() {
        return rWithdrawAmount;
    }

    public void setrWithdrawAmount(BigDecimal rWithdrawAmount) {
        this.rWithdrawAmount = rWithdrawAmount;
    }

    public Date getMirrorTime() {
        return mirrorTime;
    }

    public void setMirrorTime(Date mirrorTime) {
        this.mirrorTime = mirrorTime;
    }
}
