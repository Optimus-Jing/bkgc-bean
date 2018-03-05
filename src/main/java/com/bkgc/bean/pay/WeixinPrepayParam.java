package com.bkgc.bean.pay;

import java.io.Serializable;
import java.math.BigDecimal;

public class WeixinPrepayParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2949566034339391778L;

	/**
	 * 支付（转账的金额）
	 */
	private String totalAmount;
	/**
	 * 微信支付的描述，描述支付的商品等信息
	 */
	private String description;
	
	/**
	 * 用户Id
	 */
	private String UserId;
	
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		this.UserId = userId;
	} 
	
	
}
