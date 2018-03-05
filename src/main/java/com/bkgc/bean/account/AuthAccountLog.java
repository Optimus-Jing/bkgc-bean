package com.bkgc.bean.account;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.bkgc.bean.PageParam;

public class AuthAccountLog extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6706210409960258602L;

	private String id;

    private String orderNo;

    private Date createtime;

    private BigDecimal amount;

    private Integer amounttype;

    private String inway;

    private String outway;

    private String validcode;

    private String remark;

    private String accountid;

    private String operator;
    
    private int origin;

    private int inOutWay;
    
    private String userId;
    
    public AuthAccountLog() {
		super();
	}


    public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public AuthAccountLog(String id, Timestamp createtime, BigDecimal amount, String outway, String validcode, String remark,
			String amountId, Integer amounttype) {
    	this.id=id;
    	this.createtime= createtime;
    	this.amount=amount;
    	this.outway= outway;
    	this.validcode= validcode;
    	this.remark=remark;
    	this.accountid=amountId;
    	this.amounttype = amounttype;
	}
    
    public AuthAccountLog(String id, Timestamp createtime, BigDecimal amount, String outway, String validcode, String remark,
			String amountId, int amountType,String operator) {
    	this(id, createtime, amount, outway, validcode, remark, amountId, amountType);
    	this.operator= operator;
	}
    
    public AuthAccountLog(String id,  String inway,Timestamp createtime, BigDecimal amount, String validcode, String remark,
			String amountId, Integer amounttype) {
    	this.id=id;
    	this.createtime= createtime;
    	this.amount=amount;
    	this.inway= inway;
    	this.validcode= validcode;
    	this.remark=remark;
    	this.accountid=amountId;
    	this.amounttype = amounttype;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getAmounttype() {
        return amounttype;
    }

    public void setAmounttype(Integer amounttype) {
        this.amounttype = amounttype;
    }

    public String getInway() {
        return inway;
    }

    public void setInway(String inway) {
        this.inway = inway == null ? null : inway.trim();
    }

    public String getOutway() {
        return outway;
    }

    public void setOutway(String outway) {
        this.outway = outway == null ? null : outway.trim();
    }

    public String getValidcode() {
        return validcode;
    }

    public void setValidcode(String validcode) {
        this.validcode = validcode == null ? null : validcode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

    public int getInOutWay() {
        return inOutWay;
    }

    public void setInOutWay(int inOutWay) {
        this.inOutWay = inOutWay;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}