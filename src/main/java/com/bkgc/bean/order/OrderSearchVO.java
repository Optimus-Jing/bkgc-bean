package com.bkgc.bean.order;

import java.util.Date;
import java.util.List;

import com.bkgc.bean.CommonParams;

import lombok.Data;


@Data
public class OrderSearchVO extends CommonParams{
	private static final long serialVersionUID = 1839354110214873087L;

	private String orderNo;
	 
	 private String tradeStatus;
	 
	 private Integer channelId;
	 
	 private Date startDay;
	 
	 private Date endDay;
	 
	 private String payType;
	 
	 private String address;

	 private String outProduct;
     
	 private String machineId;
	 
     private Integer paramChannel;
     
     private Integer addAudit;
     
     private Integer machineProductId;
     
 	private String endDateStr;
 	
 	private String startDateStr;
 	
 	private Integer userId;
 	
 	private String productName;
 	
 	private String guid;
 	
	private List<Integer> machineIds;
 	
	private Integer pageNum ; //页码
    private Integer pageSize ; //每一页大小
    private Integer pageStart;//开始页数
    private String searchParam;//通用搜索字段
    private Integer recordCount; //总条数
    private Integer searchChannelId;//搜索的渠道Id
 	 
     
	 public String getEndDateStr() {
		return endDateStr;
	}

	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}

	public String getStartDateStr() {
		return startDateStr;
	}

	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getParamChannel() {
		return paramChannel;
	}

	public void setParamChannel(Integer paramChannel) {
		this.paramChannel = paramChannel;
	}

	public String getMachineId() {
		return machineId;
	 }

	 public void setMachineId(String machineId) {
		this.machineId = machineId;
	 }

	public String getOrderNo() {
		return orderNo;
	 }

  	 public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	 }

	 public String getTradeStatus() {
		return tradeStatus;
	 }

	 public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	 }

	public Date getStartDay() {
		return startDay;
	}

	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}

	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}


	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOutProduct() {
		return outProduct;
	}

	public void setOutProduct(String outProduct) {
		this.outProduct = outProduct;
	}

	public Integer getAddAudit() {
		return addAudit;
	}

	public void setAddAudit(Integer addAudit) {
		this.addAudit = addAudit;
	}

	public Integer getMachineProductId() {
		return machineProductId;
	}

	public void setMachineProductId(Integer machineProductId) {
		this.machineProductId = machineProductId;
	}

	
	 
	  
}
