package com.bkgc.bean.pay;

public class AlipayRsaCheckParam {

	/*public AlipayRsaCheckParam() {
		// TODO Auto-generated constructor stub
	}*/
	private String UserId;
	private String AccessToken;
	private String alipayTradeAppPayResponse;
	private String sign;
	private String signType;
	private String TradeNo;
	private String OutTradeNo;
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String UserId) {
		this.UserId = UserId;
	}
	public String getAccessToken() {
		return AccessToken;
	}
	public void setAccessToken(String accessToken) {
		AccessToken = accessToken;
	}
	public String getAlipayTradeAppPayResponse() {
		return alipayTradeAppPayResponse;
	}
	public void setAlipayTradeAppPayResponse(String alipayTradeAppPayResponse) {
		this.alipayTradeAppPayResponse = alipayTradeAppPayResponse;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	public String getTradeNo() {
		return TradeNo;
	}
	public void setTradeNo(String tradeNo) {
		TradeNo = tradeNo;
	}
	public String getOutTradeNo() {
		return OutTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		OutTradeNo = outTradeNo;
	}

}
