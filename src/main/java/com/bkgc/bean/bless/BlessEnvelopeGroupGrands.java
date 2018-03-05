package com.bkgc.bean.bless;


import java.math.BigDecimal;
import java.util.Date;

import com.bkgc.bean.PageParam;

public class BlessEnvelopeGroupGrands  extends PageParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
    private String groupid;
    private Integer count;
    private BigDecimal univalence;

	/**
	 * 原始数量
	 */
	private Integer originalCount;

	/**
	 * 原始金额
	 */
    private BigDecimal originalAmount;

	/**
	 * 创建时间
	 */
	private Date createTime;
    
    
    
	public BlessEnvelopeGroupGrands() {
	
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getGroupid() {
		return groupid;
	}



	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}



	public Integer getCount() {
		return count;
	}



	public void setCount(Integer count) {
		this.count = count;
	}


	public BigDecimal getUnivalence() {
		return univalence;
	}



	public void setUnivalence(BigDecimal univalence) {
		this.univalence = univalence;
	}


	public Integer getOriginalCount() {
		return originalCount;
	}

	public void setOriginalCount(Integer originalCount) {
		this.originalCount = originalCount;
	}

	public BigDecimal getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(BigDecimal originalAmount) {
		this.originalAmount = originalAmount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "BlessEnvelopeGroupGrands{" +
				"id='" + id + '\'' +
				", groupid='" + groupid + '\'' +
				", count=" + count +
				", univalence=" + univalence +
				", originalCount=" + originalCount +
				", originalAmount=" + originalAmount +
				", createTime=" + createTime +
				'}';
	}
}
