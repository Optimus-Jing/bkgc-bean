package com.bkgc.bean.lottery;

import java.math.BigDecimal;

import com.bkgc.bean.PageParam;

public class LotteryTicketOrderDetail  extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4812934430190988014L;

	private String id;

    private String lotteryticketid;

    private Integer number;

    private String orderid;
    
    private String name;

    private BigDecimal amount;

    private String imagepath;
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		this.imagepath = imagepath;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLotteryticketid() {
        return lotteryticketid;
    }

    public void setLotteryticketid(String lotteryticketid) {
        this.lotteryticketid = lotteryticketid == null ? null : lotteryticketid.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }
}