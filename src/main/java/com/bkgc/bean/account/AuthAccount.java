package com.bkgc.bean.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AuthAccount implements Serializable {

    private static final long serialVersionUID=2L;

    private String id;

    private Integer usertype;

    private String userid;

    private BigDecimal accountbalance;

    private BigDecimal blessamount;

    private String validcode;

    private Integer lovevalue;

    private String paypassword;

    private String userName;

    private String nickName;

    private String phone;

    private Date createTime;

    /**
     * 上次支付时间
     */
    private Date lastPayTime;

    /**
     * 密码输入错误次数
     */
    private int payErrorCount;

    /**
     * 账户是否锁定
     */
    private int isLock;


    private String startDate;

    private String endDate;

    public AuthAccount(){

    }


    public AuthAccount(String userid,  Integer usertype) {
    	this.userid =userid;
    	this.usertype=usertype;
	}
    
    public AuthAccount(String id, String userid,  Integer usertype,BigDecimal accountbalance,BigDecimal blessamount, Integer lovevalue) {
    	this(userid, usertype);
    	this.id =id;
    	this.accountbalance=accountbalance;
    	this.blessamount=blessamount;
    	this.lovevalue=lovevalue;
	}

	public AuthAccount(String id, Integer usertype, String userid, BigDecimal blessamount, BigDecimal accountbalance, Integer lovevalue) {
		this(userid, usertype);
		this.id=id;
		this.blessamount=blessamount;
		this.accountbalance=accountbalance;
		this.lovevalue=lovevalue;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public BigDecimal getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(BigDecimal accountbalance) {
        this.accountbalance = accountbalance;
    }

    public BigDecimal getBlessamount() {
        return blessamount;
    }

    public void setBlessamount(BigDecimal blessamount) {
        this.blessamount = blessamount;
    }

    public String getValidcode() {
        return validcode;
    }

    public void setValidcode(String validcode) {
        this.validcode = validcode == null ? null : validcode.trim();
    }

    public Integer getLovevalue() {
        return lovevalue;
    }

    public void setLovevalue(Integer lovevalue) {
        this.lovevalue = lovevalue;
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    public Date getLastPayTime() {
        return lastPayTime;
    }

    public void setLastPayTime(Date lastPayTime) {
        this.lastPayTime = lastPayTime;
    }

    public int getPayErrorCount() {
        return payErrorCount;
    }

    public void setPayErrorCount(int payErrorCount) {
        this.payErrorCount = payErrorCount;
    }

    public int getIsLock() {
        return isLock;
    }

    public void setIsLock(int isLock) {
        this.isLock = isLock;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
}