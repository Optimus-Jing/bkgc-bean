package com.bkgc.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 盘点商品bean
 * @author yanqiang
 *
 */
public class Inventory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1350595608550660488L;
	
	public Inventory() {
		this.putOnNum =0;
		this.putOffNum=0;
		this.soldNum=0;
		this.remainNum=0;
		this.startNum=0;
	}
	
	private Integer userId;
	/**
	 * 商品Id
	 */
	private Integer productId; 
	
	/**
	 * 商品名称
	 */
	private String productName;
	
	/**
	 * 上货数量
	 */
	private Integer putOnNum;
	
	/**
	 * 售出数量
	 */
	private Integer soldNum;
	
	
	/**
	 * 剩余数量
	 */
	private Integer remainNum;
	
	/**
	 * 
	 */
	private Integer putOffNum;
	
	private Date createTimeStart;
	
	private Date createTimeEnd;
	
	private Integer channelId;
	
	private Integer machineId;
	
	private Integer startNum;
	
	private String createTimeStartStr;
	
	private String createTimeEndStr;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
   
	public Integer getStartNum() {
		return startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPutOnNum() {
		return putOnNum;
	}

	public void setPutOnNum(Integer putOnNum) {
		this.putOnNum = putOnNum;
	}

	public Integer getSoldNum() {
		return soldNum;
	}

	public void setSoldNum(Integer soldNum) {
		this.soldNum = soldNum;
	}

	public Date getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeStart(Date createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getMachineId() {
		return machineId;
	}

	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}

	public Integer getPutOffNum() {
		return putOffNum;
	}

	public void setPutOffNum(Integer putOffNum) {
		this.putOffNum = putOffNum;
	}

	public String getCreateTimeStartStr() {
		return createTimeStartStr;
	}

	public void setCreateTimeStartStr(String createTimeStartStr) {
		this.createTimeStartStr = createTimeStartStr;
	}

	public String getCreateTimeEndStr() {
		return createTimeEndStr;
	}

	public void setCreateTimeEndStr(String createTimeEndStr) {
		this.createTimeEndStr = createTimeEndStr;
	}

	public void dateformat() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		if(createTimeStart!=null){
			this.setCreateTimeStartStr(sdf.format(createTimeStart));
		}
		if(createTimeEnd!=null){
			this.setCreateTimeEndStr(sdf.format(createTimeEnd));
		}
	}

	public Integer getRemainNum() {
		return remainNum;
	}

	public void setRemainNum(Integer remainNum) {
		this.remainNum = remainNum;
	}
	
	

}
