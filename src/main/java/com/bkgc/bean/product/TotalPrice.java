package com.bkgc.bean.product;

import java.io.Serializable;

public class TotalPrice  {


	
	private double totalAlipay;//支付宝统计
	private double totalWechat;//微信统计
	private double totalFujinpay;//福金统计
	private double total2price;//20元区统计
	private double total5price;//50元区统计
	private double total0price;//100元区统计
	
	public double getTotalAlipay() {
		return totalAlipay;
	}
	public void setTotalAlipay(double totalAlipay) {
		this.totalAlipay = totalAlipay;
	}
	public double getTotalWechat() {
		return totalWechat;
	}
	public void setTotalWechat(double totalWechat) {
		this.totalWechat = totalWechat;
	}
	public double getTotalFujinpay() {
		return totalFujinpay;
	}
	public void setTotalFujinpay(double totalFujinpay) {
		this.totalFujinpay = totalFujinpay;
	}
	public double getTotal2price() {
		return total2price;
	}
	public void setTotal2price(double total2price) {
		this.total2price = total2price;
	}
	public double getTotal5price() {
		return total5price;
	}
	public void setTotal5price(double total5price) {
		this.total5price = total5price;
	}
	public double getTotal0price() {
		return total0price;
	}
	public void setTotal0price(double total0price) {
		this.total0price = total0price;
	}	

}
