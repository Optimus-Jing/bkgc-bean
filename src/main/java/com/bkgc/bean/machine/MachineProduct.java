package com.bkgc.bean.machine;

import java.util.Date;

import com.bkgc.bean.product.Product;

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
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public Date getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getIsSale() {
        return isSale;
    }

    public void setIsSale(Integer isSale) {
        this.isSale = isSale;
    }

    public Date getSaleStartTime() {
        return saleStartTime;
    }

    public void setSaleStartTime(Date saleStartTime) {
        this.saleStartTime = saleStartTime;
    }

    public Date getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType == null ? null : supplyType.trim();
    }

    public Integer getIsRandom() {
        return isRandom;
    }

    public void setIsRandom(Integer isRandom) {
        this.isRandom = isRandom;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(Integer isAudit) {
        this.isAudit = isAudit;
    }

    public Integer getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(Integer warningCount) {
        this.warningCount = warningCount;
    }

    public Integer getExpiryCount() {
        return expiryCount;
    }

    public void setExpiryCount(Integer expiryCount) {
        this.expiryCount = expiryCount;
    }

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Object getCategoryName() {
		return categoryName;
	}

	public void setProductInfo(String name, String shortDescription, String description, String imgUrl,
			String litimgUrl, Integer categoryId, String categoryName2) {
	}
    
}