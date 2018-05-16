package com.bkgc.bean.vem;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class LotteryOrderDetail {
    /**
     * 编号
     */
    private String id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 商品数量
     */
    private BigDecimal goodsNum;

    /**
     * 创建时间
     */
    private Date createTime;
}