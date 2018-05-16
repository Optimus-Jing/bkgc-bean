package com.bkgc.bean.order;

import lombok.Data;

@Data
public class OrderDetail {
    private Integer id;

    private String orderNo;

    private Integer machineProductId;

    private Integer productId;

    private String productName;

    private Integer productPrice;

    private Integer aisleId;

    private String aisleName;

    private Integer productCount;

    private String countStr;

    private String priceStr;

    public OrderDetail() {
        this.productCount = 0;
        this.productPrice = 0;
    }
}