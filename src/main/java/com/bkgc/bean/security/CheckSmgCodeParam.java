package com.bkgc.bean.security;



public class CheckSmgCodeParam {

    //手机号码
    private String phone;

    //验证码
    private String code;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "CheckSmgCodeParam [phone=" + phone + ", code=" + code + "]";
	}
  
}
