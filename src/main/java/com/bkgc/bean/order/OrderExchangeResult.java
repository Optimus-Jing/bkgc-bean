package com.bkgc.bean.order;

import lombok.Data;

@Data
public class OrderExchangeResult {
    private String channel;
    private Integer terminal;
    private String money;
}
