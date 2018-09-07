package com.bkgc.bean.account;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AuthAccount implements Serializable {

    private static final long serialVersionUID = 2L;

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

    /**
     * 检查指纹支付状态
     */
    private int quickCheckStatus;

    /**
     * 用户手机imei
     */
    private String imei;


    private String startDate;

    private String endDate;

    public AuthAccount() {

    }


    public AuthAccount(String userid, Integer usertype) {
        this.userid = userid;
        this.usertype = usertype;
    }

    public AuthAccount(String id, String userid, Integer usertype, BigDecimal accountbalance, BigDecimal blessamount, Integer lovevalue) {
        this(userid, usertype);
        this.id = id;
        this.accountbalance = accountbalance;
        this.blessamount = blessamount;
        this.lovevalue = lovevalue;
    }

    public AuthAccount(String id, Integer usertype, String userid, BigDecimal blessamount, BigDecimal accountbalance, Integer lovevalue) {
        this(userid, usertype);
        this.id = id;
        this.blessamount = blessamount;
        this.accountbalance = accountbalance;
        this.lovevalue = lovevalue;
    }
}