package com.bkgc.bean.pay;

/**
 * <p>Title:      PayQueryParam </p>
 * <p>Description  支付查询通用参数/p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/6/7 下午6:32
 */
public class PayQueryParam {

//    //福金
//    String companyId = params.getString("partner");
//    String payorderid = params.getString("payorderid");
//
//    //支付宝
//    param.getUserId()
//    param.getTradeNo()
//    param.getOutTradeNo()
//
//    //微信
//    param.getUserId()
//    param.getOut_trade_no()

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
    }
}
