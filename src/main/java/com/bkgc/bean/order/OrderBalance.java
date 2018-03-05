package com.bkgc.bean.order;

import com.bkgc.bean.PageParam;

public class OrderBalance extends PageParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String OrderDate;//结算日期
	private String channelName;//渠道商名称
	private Integer machineId; //自助机编码
	private Integer count_Wechat;//微信_支付笔数
	private double pay_Wechat;//微信_支付金额
	private double pay_Wechat_out;//微信_出票成功金额
	private Integer count_alipay;//支付宝_支付笔数
	private double pay_alipay;//支付宝_支付金额
	private double pay_alipay_out;//支付宝_出票成功金额
	private Integer count_fujin;//福金_支付笔数
	private double pay_fujin;//福金_支付金额
	private double pay_fujin_out;//福金_出票成功金额
	
	
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Integer getMachineId() {
		return machineId;
	}
	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}
	public Integer getCount_Wechat() {
		return count_Wechat;
	}
	public void setCount_Wechat(Integer count_Wechat) {
		this.count_Wechat = count_Wechat;
	}
	public double getPay_Wechat() {
		return pay_Wechat;
	}
	public void setPay_Wechat(double pay_Wechat) {
		this.pay_Wechat = pay_Wechat;
	}
	public double getPay_Wechat_out() {
		return pay_Wechat_out;
	}
	public void setPay_Wechat_out(double pay_Wechat_out) {
		this.pay_Wechat_out = pay_Wechat_out;
	}
	public Integer getCount_alipay() {
		return count_alipay;
	}
	public void setCount_alipay(Integer count_alipay) {
		this.count_alipay = count_alipay;
	}
	public double getPay_alipay() {
		return pay_alipay;
	}
	public void setPay_alipay(double pay_alipay) {
		this.pay_alipay = pay_alipay;
	}
	public double getPay_alipay_out() {
		return pay_alipay_out;
	}
	public void setPay_alipay_out(double pay_alipay_out) {
		this.pay_alipay_out = pay_alipay_out;
	}
	public Integer getCount_fujin() {
		return count_fujin;
	}
	public void setCount_fujin(Integer count_fujin) {
		this.count_fujin = count_fujin;
	}
	public double getPay_fujin() {
		return pay_fujin;
	}
	public void setPay_fujin(double pay_fujin) {
		this.pay_fujin = pay_fujin;
	}
	public double getPay_fujin_out() {
		return pay_fujin_out;
	}
	public void setPay_fujin_out(double pay_fujin_out) {
		this.pay_fujin_out = pay_fujin_out;
	}
	
}
