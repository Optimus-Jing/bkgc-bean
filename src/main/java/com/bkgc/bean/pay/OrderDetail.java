package com.bkgc.bean.pay;

public class OrderDetail {
    private Integer id;

    private String orderNo;

    private Integer machineProductId;

    private String productName;

    private Integer productPrice;

    private Integer aisleId;

    private String aisleName;

    private Integer productCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getMachineProductId() {
        return machineProductId;
    }

    public void setMachineProductId(Integer machineProductId) {
        this.machineProductId = machineProductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getAisleId() {
        return aisleId;
    }

    public void setAisleId(Integer aisleId) {
        this.aisleId = aisleId;
    }

    public String getAisleName() {
        return aisleName;
    }

    public void setAisleName(String aisleName) {
        this.aisleName = aisleName == null ? null : aisleName.trim();
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
}