package com.bkgc.bean.product;

import java.io.Serializable;
import java.util.Date;

import com.bkgc.bean.PageParam;

/**
 * 商品搜索
 * @author yq
 * 
 */
public class ProductSearchVO extends PageParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4910278194405927526L;
	
	private String name; //商品名称
	private String categoryName;//类别名称
	private int status;//状态
	private Date createTimeStart;//创建开始时间
	private Date createTimeEnd;//创建结束时间
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	
	
	
}
