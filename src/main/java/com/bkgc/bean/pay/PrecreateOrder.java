package com.bkgc.bean.pay;

/**
 * 预支付订单
 * Created by jwalker on 2016年8月15日
 */
public class PrecreateOrder {
	/**
	 * 支付类型
	 */
	private String payType;

	/**
	 * 设备id
	 */
	private String deviceId;


	/**
	 * 自设备编号
	 */
	private String sdeviceId;


	/*private String aisleName;*/

	/**
	 * 产品Id
	 */
	private String productId;

	/**
	 * 产品名称
	 */
	private String productName;
	
	private String categoryName;

	/**
	 * 总金额
	 */
	private String totalFee;

	/**
	 * 产品数量
	 */
	private String productCount;

	/**
	 * 内容
	 */
	private String body;

	/**
	 * 订单号
	 */
	private String orderNo;

	/**
	 * 支付超时时间，单位为秒
	 */
	private String timeOut;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 摘要
	 */
	private String subject;

	/**
	 * 业务类型
	 */
	private String bussinessType;

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	/*public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public String getAisleId() {
		return aisleId;
	}

	public void setAisleId(String aisleId) {
		this.aisleId = aisleId;
	}

	public String getAisleName() {
		return aisleName;
	}

	public void setAisleName(String aisleName) {
		this.aisleName = aisleName;
	}

	public String getMachineProductId() {
		return machineProductId;
	}

	public void setMachineProductId(String machineProductId) {
		this.machineProductId = machineProductId;
	}*/
	

	public String getProductName() {
		return productName;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSdeviceId() {
		return sdeviceId;
	}

	public void setSdeviceId(String sdeviceId) {
		this.sdeviceId = sdeviceId;
	}
	

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBussinessType() {
		return bussinessType;
	}

	public void setBussinessType(String bussinessType) {
		this.bussinessType = bussinessType;
	}
}
