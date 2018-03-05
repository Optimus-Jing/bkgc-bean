package com.bkgc.bean.lottery;

import java.math.BigDecimal;

import com.bkgc.bean.PageParam;

public class LotteryTicket  extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1815971129888921021L;

	private String id;

    private String name;

    private BigDecimal amount;

    private String imagepath;

    private Integer sortflag;

    private Integer status;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath == null ? null : imagepath.trim();
    }

    public Integer getSortflag() {
        return sortflag;
    }

    public void setSortflag(Integer sortflag) {
        this.sortflag = sortflag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}