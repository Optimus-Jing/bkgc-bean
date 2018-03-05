package com.bkgc.bean.lottery;

import java.math.BigDecimal;

import com.bkgc.bean.PageParam;

public class LotteryTicketType extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1965545038754273669L;

	private String id;

    private String name;

    private BigDecimal amount;

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
}