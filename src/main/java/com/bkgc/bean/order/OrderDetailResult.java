package com.bkgc.bean.order;

import lombok.Data;

@Data
public class OrderDetailResult {

    private String Channel;

    private String terminal;

    private String order;

    private String tradeTime;

    private String tradeMoney;

    private String payType;

    private String tradeState;

    private String goodName;

    private String goodMoney;

    private String deliveryResult;

    private String storeName;

}
