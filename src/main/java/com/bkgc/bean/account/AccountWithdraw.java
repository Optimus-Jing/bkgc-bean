package com.bkgc.bean.account;

import java.math.BigDecimal;
import java.util.Date;

import com.bkgc.bean.PageParam;

public class AccountWithdraw extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3561446646349969298L;

	private String id;

    private String userid;

    private String username;

    private Integer usertype;

    private Integer withdrawtype;

    private String typename;

    private String targetaccount;

    private BigDecimal withdrawamount;

    private Date createtime;

    private Date withdrawtime;

    private Integer status;

    private String operator;
    
    private String remark;

    private String startDate;

    private String endDate;

    public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getWithdrawtype() {
        return withdrawtype;
    }

    public void setWithdrawtype(Integer withdrawtype) {
        this.withdrawtype = withdrawtype;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getTargetaccount() {
        return targetaccount;
    }

    public void setTargetaccount(String targetaccount) {
        this.targetaccount = targetaccount == null ? null : targetaccount.trim();
    }

    public BigDecimal getWithdrawamount() {
        return withdrawamount;
    }

    public void setWithdrawamount(BigDecimal withdrawamount) {
        this.withdrawamount = withdrawamount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getWithdrawtime() {
        return withdrawtime;
    }

    public void setWithdrawtime(Date withdrawtime) {
        this.withdrawtime = withdrawtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}