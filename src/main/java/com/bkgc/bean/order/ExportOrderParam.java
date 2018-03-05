package com.bkgc.bean.order;

import java.io.Serializable;
import java.util.Date;

public class ExportOrderParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9155591802274137970L;

	
	public ExportOrderParam() {
	}
	
	private Integer channelId;
	private Date startDate;
	private String startDateStr;
	private Date endDate;
	private String endDateStr;
	private String userName;
	private String viewName="OrderCompInfo_View_";
	private Integer userId;
	
	public ExportOrderParam(Integer channelId,String userName) {
		this.channelId=channelId;
		this.userName=userName;
		this.viewName=this.viewName.concat(userName);
	}
	

	public String getStartDateStr() {
		return startDateStr;
	}


	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}


	public String getEndDateStr() {
		return endDateStr;
	}


	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}


	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
		this.viewName=this.viewName.concat(userName);
	}

	public String getViewName() {
		return viewName;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}

/*
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}*/

}
