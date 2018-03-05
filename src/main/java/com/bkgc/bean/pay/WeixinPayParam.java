package com.bkgc.bean.pay;

import java.io.Serializable;

public class WeixinPayParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7101148752211572353L;
	
	/**
	 * 用户Id
	 */
	private String UserId;
	
	/**
	 * 返回状态码
	 */
	private String return_code; 
	
	/**
	 * 返回信息
	 */
	private String mreturn_msg;
	
	/**
	 * 应用ID
	 */
	private String appid;
	
	/**
	 * 商户号
	 */
	private String mch_id;
	
	/**
	 * 随机字符串
	 */
	private String nonce_str;
	
	/**
	 * 签名
	 */
	private String sign;
	
	/**
	 * 业务结果
	 */
	private String result_code;
	
	/**
	 * 微信用户标识
	 */
	private String 	openid;

	/**
	 * 交易类型
	 */
	private String 	trade_type;
	
	/**
	 * 银行类型
	 */
	private String bank_type;
	
	/**
	 * 订单总金额，单位为分
	 */
	private int total_fee;
	
	/**
	 * 现金支付金额
	 */
	private int cash_fee;
	
	/**
	 * 微信支付订单号
	 */
	private String transaction_id;
	
	/**
	 * 商户订单号
	 */
	private String out_trade_no;
	
	
	/**
	 * 支付完成时间
	 */
	private String time_end;
	
	private String trade_state_desc;
	
	private String trade_state;
	
	
	private String fee_type;
	
	private String is_subscribe;
	
	
	

	public String getIs_subscribe() {
		return is_subscribe;
	}

	public void setIs_subscribe(String is_subscribe) {
		this.is_subscribe = is_subscribe;
	}

	public String getFee_type() {
		return fee_type;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String UserId) {
		this.UserId = UserId;
	}

	public String getReturn_code() {
		return return_code;
	}

	public void setReturn_code(String return_code) {
		this.return_code = return_code;
	}

	public String getMreturn_msg() {
		return mreturn_msg;
	}

	public void setMreturn_msg(String mreturn_msg) {
		this.mreturn_msg = mreturn_msg;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMch_id() {
		return mch_id;
	}

	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getResult_code() {
		return result_code;
	}

	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public String getBank_type() {
		return bank_type;
	}

	public void setBank_type(String bank_type) {
		this.bank_type = bank_type;
	}

	public int getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}

	public int getCash_fee() {
		return cash_fee;
	}

	public void setCash_fee(int cash_fee) {
		this.cash_fee = cash_fee;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getTime_end() {
		return time_end;
	}

	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}

	public String getTrade_state_desc() {
		return trade_state_desc;
	}

	public void setTrade_state_desc(String trade_state_desc) {
		this.trade_state_desc = trade_state_desc;
	}

	public String getTrade_state() {
		return trade_state;
	}

	public void setTrade_state(String trade_state) {
		this.trade_state = trade_state;
	}

	@Override
	public String toString() {
		return "WeixinPayParam [UserId=" + UserId + ", return_code=" + return_code + ", mreturn_msg=" + mreturn_msg
				+ ", appid=" + appid + ", mch_id=" + mch_id + ", nonce_str=" + nonce_str + ", sign=" + sign
				+ ", result_code=" + result_code + ", openid=" + openid + ", trade_type=" + trade_type + ", bank_type="
				+ bank_type + ", total_fee=" + total_fee + ", cash_fee=" + cash_fee + ", transaction_id="
				+ transaction_id + ", out_trade_no=" + out_trade_no + ", time_end=" + time_end + ", trade_state_desc="
				+ trade_state_desc + ", trade_state=" + trade_state + "]";
	}

	
	
}
