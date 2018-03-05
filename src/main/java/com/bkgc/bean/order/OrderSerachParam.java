package com.bkgc.bean.order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class OrderSerachParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public OrderSerachParam() {
		
	}
		private String startDateStr;//报表统计起始时间
		private String endDateStr;//报表统计结束时间
		private Integer channelId;//渠道Id
		private String userName;
		private Integer userId;
		private Integer machineId;//自助机编码
		private double orderPrice;//订单价格
		
		private String ticketId;
		
		private String payment;//订单支付方式
		
		private String shipStatus ;//出货状态
		
		private Date startDate;
		private Date endDate;
		
		private String fromUserId;
		
		private List<Integer> idList;
		
		private List<String> groupIds;
		
		private Integer pageNum ; //页码
	    private Integer pageSize ; //每一页大小
	    private Integer pageStart;//开始页数
	    private String searchParam;//通用搜索字段
	    private Integer recordCount; //总条数
	    private Integer searchChannelId;//搜索的渠道Id
		
		public String getTicketId() {
			return ticketId;
		}

		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}

		public List<String> getGroupIds() {
			return groupIds;
		}

		public void setGroupIds(List<String> groupIds) {
			this.groupIds = groupIds;
		}

		public String getShipStatus() {
			return shipStatus;
		}

		public void setShipStatus(String shipStatus) {
			this.shipStatus = shipStatus;
		}

		public Integer getMachineId() {
			return machineId;
		}

		public void setMachineId(Integer machineId) {
			this.machineId = machineId;
		}

		public double getOrderPrice() {
			return orderPrice;
		}

		public void setOrderPrice(double orderPrice) {
			this.orderPrice = orderPrice;
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

		public String getPayment() {
			return payment;
		}

		public void setPayment(String payment) {
			this.payment = payment;
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

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public List<Integer> getIdList() {
			return idList;
		}

		public void setIdList(List<Integer> idList) {
			this.idList = idList;
		}
}
