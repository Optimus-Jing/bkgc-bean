package com.bkgc.bean.order;

import java.util.Date;

import com.bkgc.bean.PageParam;

public class OrderCompleteToFrom extends PageParam {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private Integer machinePid;
	private String productName;
	private Integer productPrice; 
	private Integer machineId; //自主机id
	private String address; //地址
	private Integer channelIdOfloginUser;
	private Integer channelId; //渠道Id
	private String operator;//运营人员
	private String channelName; //渠道名称
	private int regionCode;//所属县区编码
	private String province; //省、直辖市、自治区
	private String city; //地区市、自治州
	private String district; //县、区、旗等
	
	private Date startDate; //查询生成订单起始时间
	private Date endDate; //查询生成订单结束时间
	private String userName; //用户名称
	

	private double tPrice;//20元区
	private double fPrice;//50元区
	private double hPrice;//100元区
	
	private double alipay;//支付宝支付
	private double wechat;//微信支付
	private double fujinpay;//福金支付
	
	private String startDateStr;
	private String endDateStr;
	private Integer userId;
	
	
	public String getStartDateStr() {
		return startDateStr;
	}


	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}


	public String getEndDateStr() {
		return endDateStr;
	}


	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public OrderCompleteToFrom() {
		
	}


	public Integer getMachinePid() {
		return machinePid;
	}


	public void setMachinePid(Integer machinePid) {
		this.machinePid = machinePid;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Integer getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}


	public Integer getMachineId() {
		return machineId;
	}


	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Integer getChannelIdOfloginUser() {
		return channelIdOfloginUser;
	}


	public void setChannelIdOfloginUser(Integer channelIdOfloginUser) {
		this.channelIdOfloginUser = channelIdOfloginUser;
	}


	public Integer getChannelId() {
		return channelId;
	}


	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}


	public String getOperator() {
		return operator;
	}


	public void setOperator(String operator) {
		this.operator = operator;
	}


	public String getChannelName() {
		return channelName;
	}


	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}


	public int getRegionCode() {
		return regionCode;
	}


	public void setRegionCode(int regionCode) {
		this.regionCode = regionCode;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public double gettPrice() {
		return tPrice;
	}


	public void settPrice(double tPrice) {
		this.tPrice = tPrice;
	}


	public double getfPrice() {
		return fPrice;
	}


	public void setfPrice(double fPrice) {
		this.fPrice = fPrice;
	}


	public double gethPrice() {
		return hPrice;
	}


	public void sethPrice(double hPrice) {
		this.hPrice = hPrice;
	}


	public double getAlipay() {
		return alipay;
	}


	public void setAlipay(double alipay) {
		this.alipay = alipay;
	}


	public double getWechat() {
		return wechat;
	}


	public void setWechat(double wechat) {
		this.wechat = wechat;
	}


	public double getFujinpay() {
		return fujinpay;
	}


	public void setFujinpay(double fujinpay) {
		this.fujinpay = fujinpay;
	}


	
	@Override
	public String toString() {
		return "OrderCompleteToFrom [  tPrice=" + tPrice + ", fPrice=" + fPrice
				+ ", hPrice=" + hPrice + ", alipay=" + alipay + ", wechat=" + wechat + ", fujinpay=" + fujinpay + "]";
	}
	
	
	


	
	
}
