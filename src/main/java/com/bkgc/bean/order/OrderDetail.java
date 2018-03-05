package com.bkgc.bean.order;

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
    	this.productCount=0;
    	this.productPrice=0;
	}

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

    public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
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

	public String getCountStr() {
		return countStr;
	}

	public void setCountStr(String countStr) {
		this.countStr = countStr;
	}

	public String getPriceStr() {
		return priceStr;
	}

	public void setPriceStr(String priceStr) {
		this.priceStr = priceStr;
	}
    
}