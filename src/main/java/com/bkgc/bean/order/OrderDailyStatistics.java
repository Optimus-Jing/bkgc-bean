package com.bkgc.bean.order;

import java.math.BigDecimal;

public class OrderDailyStatistics {
	
	/**
	 * 日期字符串（YYYYMMdd）
	 */
	private String dateStr;
	
	/**
	 * 当日订单总额
	 */
	private String totalMoney;
	
	/**
	 * 当日订单数量
	 */
	private int productNum;
	
	private String totalAmount;
	
	

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = String.valueOf(totalAmount.doubleValue());
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public String getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(BigDecimal totalMoney) {
//		this.totalMoney=totalMoney.divide(new BigDecimal(100)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
		this.totalMoney=totalMoney.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
}
