package com.bkgc.bean.account;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AccountWithdraw extends PageParam {
    private static final long serialVersionUID = 3561446646349969298L;

    private String id;

    private String userid;

    private String username;

    private Integer usertype;

    private Integer withdrawtype;

    private String typename;

    private String targetaccount;

    private BigDecimal withdrawamount;

    private Date createtime;

    private Date withdrawtime;

    private Integer status;

    private String operator;

    private String remark;

    private String startDate;

    private String endDate;

}