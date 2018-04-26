package com.bkgc.bean.machine;

import lombok.Data;

@Data
public class AisleUpdate {
    private Integer aisleId;
    private Integer productId;
    private Integer mproductId; //自助机商品id
    private Integer count;
    private Integer status;
    private String productName;
    private Integer productStatus;
    private String categoryName;
    private String shortDescription;
    private String description;
    private String imgUrl;
    private String litimgUrl;
    private Integer price;
    private Integer salePrice;
}
