package com.bkgc.bean.account;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class AuthAccountLog extends PageParam {

    private static final long serialVersionUID = -6706210409960258602L;

    private String id;

    private String orderNo;

    private Date createtime;

    private BigDecimal amount;

    private Integer amounttype;

    private String inway;

    private String outway;

    private String validcode;

    private String remark;

    private String accountid;

    private String operator;

    private int origin;

    private int inOutWay;

    private String userId;

    public AuthAccountLog() {
        super();
    }

    public AuthAccountLog(String id, Timestamp createtime, BigDecimal amount, String outway, String validcode, String remark,
                          String amountId, Integer amounttype) {
        this.id = id;
        this.createtime = createtime;
        this.amount = amount;
        this.outway = outway;
        this.validcode = validcode;
        this.remark = remark;
        this.accountid = amountId;
        this.amounttype = amounttype;
    }

    public AuthAccountLog(String id, Timestamp createtime, BigDecimal amount, String outway, String validcode, String remark,
                          String amountId, int amountType, String operator) {
        this(id, createtime, amount, outway, validcode, remark, amountId, amountType);
        this.operator = operator;
    }

    public AuthAccountLog(String id, String inway, Timestamp createtime, BigDecimal amount, String validcode, String remark,
                          String amountId, Integer amounttype) {
        this.id = id;
        this.createtime = createtime;
        this.amount = amount;
        this.inway = inway;
        this.validcode = validcode;
        this.remark = remark;
        this.accountid = amountId;
        this.amounttype = amounttype;
    }
}