package com.bkgc.bean.lottery;

import java.util.Date;

import com.bkgc.bean.PageParam;

public class LottoJkpAwardAsktLog extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3677983143192392825L;

	private String id;

    private String userid;

    private String ticketid;

    private String lottosn;

    private Date requesttime;

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

    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid == null ? null : ticketid.trim();
    }

    public String getLottosn() {
        return lottosn;
    }

    public void setLottosn(String lottosn) {
        this.lottosn = lottosn == null ? null : lottosn.trim();
    }

    public Date getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(Date requesttime) {
        this.requesttime = requesttime;
    }
}