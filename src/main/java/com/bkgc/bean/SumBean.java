package com.bkgc.bean;

import java.math.BigDecimal;

/**
 * Created by gmg on on 2017-11-28 17:27.
 */
public class SumBean {

    private Integer accountNum;
    //可提现总金额
    private BigDecimal sumAccountBalance;
    //账户总金额
    private  BigDecimal sumBlessAmount;

    private int UserType;

    public Integer getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public BigDecimal getSumAccountBalance() {
        return sumAccountBalance;
    }

    public void setSumAccountBalance(BigDecimal sumAccountBalance) {
        this.sumAccountBalance = sumAccountBalance;
    }

    public BigDecimal getSumBlessAmount() {
        return sumBlessAmount;
    }

    public void setSumBlessAmount(BigDecimal sumBlessAmount) {
        this.sumBlessAmount = sumBlessAmount;
    }

    public int getUserType() {
        return UserType;
    }

    public void setUserType(int userType) {
        UserType = userType;
    }


}
