package com.bkgc.bean.account;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 账户充值bean
 * Created by yanqiang on 2017/11/15.
 */
@Data
public class AccountRecharge {

    private String id;

    private String accountId;

    private Date rechargeTime;

    private BigDecimal amount;

    private int type;

    private String typeMark;

    private String remark;

    private String operator;

    private String orderNo;

    private Integer status;
}
