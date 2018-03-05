package com.bkgc.bean.bless;

import java.math.BigDecimal;

public class BlessReciver {
	
	private String nickName; //昵称
	private String phone; //电话
	private BigDecimal awardAmount; //中奖金额
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public BigDecimal getAwardAmount() {
		return awardAmount;
	}
	public void setAwardAmount(BigDecimal awardAmount) {
		this.awardAmount = awardAmount;
	}
	
}
