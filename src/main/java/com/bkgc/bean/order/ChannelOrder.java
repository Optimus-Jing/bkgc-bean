package com.bkgc.bean.order;

import java.io.Serializable;
import java.util.Date;

public class ChannelOrder implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1104454491973197637L;
	private Integer UserId;
    private Integer pageIndex;
    private Integer pageSize;
    private Date startTime;
    private Date endTime;
    private Integer terminal;
    private Integer channelOrder;
    private Integer moneyOrder;
    private Integer terminalOrder;
    private String channel;
    private Integer channelId;
    private Integer searchChannelId;
    private String tradeType;
    private String deliveryType;
    private Integer arrayId;
    
	public Integer getArrayId() {
		return arrayId;
	}
	public void setArrayId(Integer arrayId) {
		this.arrayId = arrayId;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public Integer getSearchChannelId() {
		return searchChannelId;
	}
	public void setSearchChannelId(Integer searchChannelId) {
		this.searchChannelId = searchChannelId;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getTerminal() {
		return terminal;
	}
	public void setTerminal(Integer terminal) {
		this.terminal = terminal;
	}
	public Integer getChannelOrder() {
		return channelOrder;
	}
	public void setChannelOrder(Integer channelOrder) {
		this.channelOrder = channelOrder;
	}
	public Integer getMoneyOrder() {
		return moneyOrder;
	}
	public void setMoneyOrder(Integer moneyOrder) {
		this.moneyOrder = moneyOrder;
	}
	public Integer getTerminalOrder() {
		return terminalOrder;
	}
	public void setTerminalOrder(Integer terminalOrder) {
		this.terminalOrder = terminalOrder;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
    
    
    
}
