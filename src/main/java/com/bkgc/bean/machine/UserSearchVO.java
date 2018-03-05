package com.bkgc.bean.machine;

import com.bkgc.bean.PageParam;

public class UserSearchVO extends PageParam{
	
	private String userName;
	
	private String loginId;
	
	private String phone;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
