package com.bkgc.bean.vem;



import java.util.Date;

import com.bkgc.bean.PageParam;


public class RefundSearchVO extends PageParam{
	
	private String userName;
	
	private String orderNo;
	
	private Date startOrder;
	
	private Date endOrder;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getStartOrder() {
		return startOrder;
	}

	public void setStartOrder(Date startOrder) {
		this.startOrder = startOrder;
	}

	public Date getEndOrder() {
		return endOrder;
	}

	public void setEndOrder(Date endOrder) {
		this.endOrder = endOrder;
	}
	
	

}
