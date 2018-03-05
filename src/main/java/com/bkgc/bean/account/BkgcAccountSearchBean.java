package com.bkgc.bean.account;

import com.bkgc.bean.PageParam;

/**
 * Created by yanqiang on 2017/11/20.
 */
public class BkgcAccountSearchBean extends PageParam{
    private String operator;

    private String rechargeType;

    private String startDate;

    private String endDate;

    private String withdrawType;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getWithdrawType() {
        return withdrawType;
    }

    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType;
    }
}
