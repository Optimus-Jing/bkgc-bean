package com.bkgc.bean.order;

import java.math.BigDecimal;

public class OrderMonthlyStatistics {
	
	/**
	 * 月字符串（YYYYMM）
	 */
	private String monthStr;
	
	/**
	 * 当日订单总额
	 */
	private String totalMoney;
	
	/**
	 * 当日订单数量
	 */
	private int productNum;

	

	public String getMonthStr() {
		return monthStr;
	}

	public void setMonthStr(String monthStr) {
		this.monthStr = monthStr;
	}

	public String getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney=totalMoney.divide(new BigDecimal(100)).setScale(2).toString();
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
}
