package com.bkgc.bean.order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.bkgc.bean.PageParam;


public class OrderCompleteInfo extends PageParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -420853785880371421L;
	private Integer machinePid;
	private String productName;
	private Integer productPrice; 
	private String orderNo; //订单号
	private Date createTime; //创建时间
	private Integer orderPrice; //总价（以分为单位）
	private String payType; //支付类型 
	private String tradeStatus; //交易状态
	private String shipStatus; //出货状态
	private Integer machineId; //自主机id
	private Integer userId; //自主机负责人id
	private Integer storeId; //店铺Id
	private String storeName; //店铺名称
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
	
	private List<Integer> regionlist; //区域列表
	

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


	public OrderCompleteInfo() {
	}


	public String getOrderNo() {
		return orderNo;
	}


	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public String getPayType() {
		return payType;
	}


	public void setPayType(String payType) {
		this.payType = payType;
	}


	public String getTradeStatus() {
		return tradeStatus;
	}


	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}


	public String getShipStatus() {
		return shipStatus;
	}


	public void setShipStatus(String shipStatus) {
		this.shipStatus = shipStatus;
	}


	public Integer getMachineId() {
		return machineId;
	}


	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getStoreId() {
		return storeId;
	}


	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}


	public Integer getChannelId() {
		return channelId;
	}


	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}


	public String getChannelName() {
		return channelName;
	}


	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
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


	public Integer getOrderPrice() {
		return orderPrice;
	}


	public void setOrderPrice(Integer orderPrice) {
		this.orderPrice = orderPrice;
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


	public List<Integer> getRegionlist() {
		return regionlist;
	}


	public void setRegionlist(List<Integer> regionlist) {
		this.regionlist = regionlist;
	}


	public String getOperator() {
		return operator;
	}


	public void setOperator(String operator) {
		this.operator = operator;
	}


	public Integer getChannelIdOfloginUser() {
		return channelIdOfloginUser;
	}


	public void setChannelIdOfloginUser(Integer channelIdOfloginUser) {
		this.channelIdOfloginUser = channelIdOfloginUser;
	}

	
}
