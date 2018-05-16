package com.bkgc.bean.pay;

import lombok.Data;

@Data
public class OrderDetail {
    private Integer id;

    private String orderNo;

    private Integer machineProductId;

    private String productName;

    private Integer productPrice;

    private Integer aisleId;

    private String aisleName;

    private Integer productCount;

}