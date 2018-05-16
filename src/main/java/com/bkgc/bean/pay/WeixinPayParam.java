package com.bkgc.bean.pay;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeixinPayParam implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7101148752211572353L;

    /**
     * 用户Id
     */
    private String UserId;

    /**
     * 返回状态码
     */
    private String return_code;

    /**
     * 返回信息
     */
    private String mreturn_msg;

    /**
     * 应用ID
     */
    private String appid;

    /**
     * 商户号
     */
    private String mch_id;

    /**
     * 随机字符串
     */
    private String nonce_str;

    /**
     * 签名
     */
    private String sign;

    /**
     * 业务结果
     */
    private String result_code;

    /**
     * 微信用户标识
     */
    private String openid;

    /**
     * 交易类型
     */
    private String trade_type;

    /**
     * 银行类型
     */
    private String bank_type;

    /**
     * 订单总金额，单位为分
     */
    private int total_fee;

    /**
     * 现金支付金额
     */
    private int cash_fee;

    /**
     * 微信支付订单号
     */
    private String transaction_id;

    /**
     * 商户订单号
     */
    private String out_trade_no;

    /**
     * 支付完成时间
     */
    private String time_end;

    private String trade_state_desc;

    private String trade_state;

    private String fee_type;

    private String is_subscribe;

}
