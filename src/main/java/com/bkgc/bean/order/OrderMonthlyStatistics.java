package com.bkgc.bean.order;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderMonthlyStatistics {

    /**
     * 月字符串（YYYYMM）
     */
    private String monthStr;

    /**
     * 当日订单总额
     */
    private String totalMoney;

    /**
     * 当日订单数量
     */
    private int productNum;

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney.divide(new BigDecimal(100)).setScale(2).toString();
    }
}
