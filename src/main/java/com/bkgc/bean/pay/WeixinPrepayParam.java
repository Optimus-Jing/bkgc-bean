package com.bkgc.bean.pay;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeixinPrepayParam implements Serializable {

    private static final long serialVersionUID = -2949566034339391778L;

    /**
     * 支付（转账的金额）
     */
    private String totalAmount;
    /**
     * 微信支付的描述，描述支付的商品等信息
     */
    private String description;

    /**
     * 用户Id
     */
    private String UserId;
}
