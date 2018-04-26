package com.bkgc.bean.machine;

import com.bkgc.bean.product.Product;
import lombok.Data;

import java.util.Date;

@Data
public class MachineProduct {
    private Integer id;

    private Integer machineId;

    private Integer productId;

    private String barcode;

    private Date expiryTime;

    private Integer purchasePrice;

    private Integer price;

    private Integer salePrice;

    private Integer isSale;

    private Date saleStartTime;

    private Date saleEndTime;

    private String supplyType;

    private Integer isRandom;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private Integer isAudit;

    private Integer warningCount;

    private Integer expiryCount;

    private Product product;

    private String categoryName;
}