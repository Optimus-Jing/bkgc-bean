package com.bkgc.bean.machine;

public class AisleUpdate {
	private Integer aisleId;
	private Integer productId;
	private Integer mproductId; //自助机商品id
	private Integer count;
	private Integer status;
    private String productName;
    private Integer  productStatus;
    private  String categoryName;
    private  String shortDescription;
    private String description;
    private String imgUrl;
    private String  litimgUrl;
    private Integer price;
    private Integer salePrice;
    
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAisleId() {
		return aisleId;
	}

	public void setAisleId(Integer aisleId) {
		this.aisleId = aisleId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getMproductId() {
		return mproductId;
	}

	public void setMproductId(Integer mproductId) {
		this.mproductId = mproductId;
	}

}
