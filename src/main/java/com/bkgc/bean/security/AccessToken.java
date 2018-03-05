package com.bkgc.bean.security;

import java.io.Serializable;
import java.sql.Timestamp;

public class AccessToken implements Serializable{

	/**
	 * 增加token Bean
	 */
	private static final long serialVersionUID = 4869968349568479984L;
	
	
	private String refreshToken;
	private Timestamp  expireTime;
	
	private byte[] accessToken;

	public byte[] getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(byte[] accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public Timestamp getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(Timestamp expireTime) {
		this.expireTime = expireTime;
	}
	

}
