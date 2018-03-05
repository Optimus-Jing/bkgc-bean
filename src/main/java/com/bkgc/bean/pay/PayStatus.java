package com.bkgc.bean.pay;

public interface PayStatus {
	
	//-----------------支付状态-----------------------
	String TRADSTATE_NOPAY="NOPAY";
	String TRADSTATE_SUCCESS = "SUCCESS";
	String TRADSTATE_REFUND="REFUND";
	String TRADSTATE_CLOSED="CLOSED";
	String TRADSTATE_PAYERROR="PAYERROR";


	//-----------------出货状态-----------------------
	String SHOPSTATUS_YES = "已出货";
	String SHOPSTATUS_NO = "未出货";
}
