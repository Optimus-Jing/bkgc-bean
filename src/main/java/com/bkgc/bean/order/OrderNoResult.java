package com.bkgc.bean.order;

import lombok.Data;

@Data
public class OrderNoResult {
    private String channel;
    private Integer terminal;
    private String orderId;
    private Integer count;

}
