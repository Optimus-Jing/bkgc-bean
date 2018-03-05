package com.bkgc.bean.order;

import java.util.Date;

import com.bkgc.bean.PageParam;


public class PayBillSearchVO extends PageParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String type;

	private String machineId;

	private String orderNo;

	private String payType;

	private String tradeStatus;

	private String macId;

	private Date orderInStart;

	private Date orderOutEnd;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getMacId() {
		return macId;
	}

	public void setMacId(String macId) {
		this.macId = macId;
	}

	public Date getOrderInStart() {
		return orderInStart;
	}

	public void setOrderInStart(Date orderInStart) {
		this.orderInStart = orderInStart;
	}

	public Date getOrderOutEnd() {
		return orderOutEnd;
	}

	public void setOrderOutEnd(Date orderOutEnd) {
		this.orderOutEnd = orderOutEnd;
	}

}
