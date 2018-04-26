package com.bkgc.bean.pay;

public class Account {
    public class AccountType {
        public static final int Cash = 0;//现金
        public static final int FuJin = 1;//福金
    }

    public class UserType {
        public static final int Admin = 0;
        public static final int Member = 1;
        public static final int Company = 2;
    }

    private int userType;

    /**
     * 用户类型(1个人2企业)
     */
    public int getUserType() {
        return this.userType;
    }

    /**
     * 用户类型(1个人2企业)
     */
    public void setUserType(int userType) {
        this.userType = userType;
    }

    private String userId;

    /**
     * 用户编号
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 用户编号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    private double accountBalance;

    /**
     * 账户余额
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * 账户余额
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    private double blessAmount;

    /**
     * 福金
     */
    public double getBlessAmount() {
        return this.blessAmount;
    }

    /**
     * 福金
     */
    public void setBlessAmount(double blessAmount) {
        this.blessAmount = blessAmount;
    }

    private String validCode;

    /**
     * 校验码(时间、金额、会员类型、会员编号加密字符串)，用于防止人为篡改数据
     */
    public String getValidCode() {
        return this.validCode;
    }

    /**
     * 校验码(时间、金额、会员类型、会员编号加密字符串)，用于防止人为篡改数据
     */
    public void setValidCode(String validCode) {
        this.validCode = validCode;
    }

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String payPassword;

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public double awardmoney;

    public double getAwardmoney() {
        return awardmoney;
    }

    public void setAwardmoney(double awardmoney) {
        this.awardmoney = awardmoney;
    }

    @Override
    public String toString() {
        return "Account [userType=" + userType + ", userId=" + userId + ", accountBalance=" + accountBalance
                + ", blessAmount=" + blessAmount + ", validCode=" + validCode + ", key=" + key + ", payPassword="
                + payPassword + ", awardmoney=" + awardmoney + "]";
    }

}

