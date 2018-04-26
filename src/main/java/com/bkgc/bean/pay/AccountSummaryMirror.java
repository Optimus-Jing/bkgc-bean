package com.bkgc.bean.pay;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yanqiang on 2017/11/29.
 */
@Data
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
}
