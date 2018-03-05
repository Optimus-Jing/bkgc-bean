package com.bkgc.bean.vem;

import java.math.BigDecimal;
import java.util.Date;

public class DailySummary {
	
	private String id;
	private Date Data_of_date;
	private Integer sceneId;
	private String sceneName;
	private Integer productId;
	private String productName;
	private BigDecimal salesAmount;
	private Date genTime;
	private BigDecimal totalAmount;
	private Integer totalCount;
	
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getData_of_date() {
		return Data_of_date;
	}
	public void setData_of_date(Date data_of_date) {
		Data_of_date = data_of_date;
	}
	public Integer getSceneId() {
		return sceneId;
	}
	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}
	public String getSceneName() {
		return sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
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
		this.productName = productName;
	}
	public BigDecimal getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(BigDecimal salesAmount) {
		this.salesAmount = salesAmount;
	}
	public Date getGenTime() {
		return genTime;
	}
	public void setGenTime(Date genTime) {
		this.genTime = genTime;
	}
	@Override
	public String toString() {
		return "DailySummary [id=" + id + ", Data_of_date=" + Data_of_date + ", sceneId=" + sceneId + ", sceneName="
				+ sceneName + ", productId=" + productId + ", productName=" + productName + ", salesAmount="
				+ salesAmount + ", genTime=" + genTime + ", totalAmount=" + totalAmount + ", totalCount=" + totalCount
				+ "]";
	}
}
