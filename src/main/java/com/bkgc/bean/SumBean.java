package com.bkgc.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by gmg on on 2017-11-28 17:27.
 */
@Data
public class SumBean {

    private Integer accountNum;
    //可提现总金额
    private BigDecimal sumAccountBalance;
    //账户总金额
    private BigDecimal sumBlessAmount;

    private int UserType;

}
