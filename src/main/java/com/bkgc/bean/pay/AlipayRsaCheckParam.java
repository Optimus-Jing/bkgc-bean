package com.bkgc.bean.pay;

import lombok.Data;

@Data
public class AlipayRsaCheckParam {

    private String UserId;
    private String AccessToken;
    private String alipayTradeAppPayResponse;
    private String sign;
    private String signType;
    private String TradeNo;
    private String OutTradeNo;
}
