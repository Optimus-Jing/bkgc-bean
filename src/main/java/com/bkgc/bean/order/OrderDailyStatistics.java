package com.bkgc.bean.order;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDailyStatistics {

    /**
     * 日期字符串（YYYYMMdd）
     */
    private String dateStr;

    /**
     * 当日订单总额
     */
    private String totalMoney;

    /**
     * 当日订单数量
     */
    private int productNum;

    private String totalAmount;


    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney.setScale(2, BigDecimal.ROUND_HALF_UP).toString();
    }
}
