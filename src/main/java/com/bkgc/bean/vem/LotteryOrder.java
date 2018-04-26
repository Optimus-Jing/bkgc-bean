package com.bkgc.bean.vem;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Data
public class LotteryOrder {
    /**
     * 编号
     */
    private String id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 微信支付订单号
     */
    private String wechatOrderNo;

    /**
     * 商户id
     */
    private String mchId;

    /**
     * 服务商户id
     */
    private String serviceMchId;

    /**
     * 订单总额
     */
    private BigDecimal orderTotalAmount;

    /**
     * 福包支付额
     */
    private BigDecimal blessAmount;

    /**
     * 福包折扣额
     */
    private BigDecimal blessDiscount;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 微信支付额
     */
    private BigDecimal wechatAmount;

    /**
     * 收货人
     */
    private String receivePeople;

    /**
     * 联系方式
     */
    private String contactType;

    /**
     * 收货地址
     */
    private String receiveAddress;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付状态
     */
    private String payStatus;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 配送时间
     */
    private Date sendTime;

    /**
     * 完成时间
     */
    private Date finishTime;

    /**
     * 订单明细
     */
    private List<LotteryOrderDetail> detailList;

    private String startDate;

    private String endDate;
    //商户名称
    private String username;

}