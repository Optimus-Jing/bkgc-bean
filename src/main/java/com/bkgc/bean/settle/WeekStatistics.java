package com.bkgc.bean.settle;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


/**
 * Created by yanqiang on 2017/11/10.
 */
@Data
public class WeekStatistics {

    /**
     * 以周为单位的统计编码
     */
    private String weekNo;


    /**
     * 统计周开始日期
     */
    private String startDate;

    /**
     * 统计周结束日期
     */
    private String endDate;

    /**
     * 自助机交易订单交易额汇总
     */
    private BigDecimal vemTotal;

    /**
     * 支付系统订单交易额汇总
     */
    private BigDecimal paymentTotal;

    /**
     * 第三方系统订单交易额汇总
     */
    private BigDecimal thirdTotal;

    /**
     * 应结算金额
     */
    private BigDecimal forSettle;

    private List<String> deviceList;

    /**
     * 核查数据结果状态(1.正常,0不正常)
     */
    private int status;

    /**
     * 需要结算的设备总数
     */
    private int count;

    private int settleState;

}
