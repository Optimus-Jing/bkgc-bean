package com.bkgc.bean.lottery;

import java.util.Date;

import com.bkgc.bean.PageParam;

public class LottoJkpAwardCheckLog extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4624149795587456490L;

	private String id;

    private String ticketid;

    private Integer awardlevel;

    private Integer checkmoney;

    private String checkerid;

    private String checkerip;

    private Date checktime;

    private String validcode;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid == null ? null : ticketid.trim();
    }

    public Integer getAwardlevel() {
        return awardlevel;
    }

    public void setAwardlevel(Integer awardlevel) {
        this.awardlevel = awardlevel;
    }

    public Integer getCheckmoney() {
        return checkmoney;
    }

    public void setCheckmoney(Integer checkmoney) {
        this.checkmoney = checkmoney;
    }

    public String getCheckerid() {
        return checkerid;
    }

    public void setCheckerid(String checkerid) {
        this.checkerid = checkerid == null ? null : checkerid.trim();
    }

    public String getCheckerip() {
        return checkerip;
    }

    public void setCheckerip(String checkerip) {
        this.checkerip = checkerip == null ? null : checkerip.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
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
}