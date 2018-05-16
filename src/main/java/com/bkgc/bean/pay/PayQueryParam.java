package com.bkgc.bean.pay;

import lombok.Data;

/**
 * <p>Title:      PayQueryParam </p>
 * <p>Description  支付查询通用参数/p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/6/7 下午6:32
 */
@Data
public class PayQueryParam {
    /**
     * 支付类型
     */
    private String payType;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 预支付单号
     */
    private String payOrderId;

    /**
     * 交易编号(支付宝专用)
     */
    private String tradeNo;
}
