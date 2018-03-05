package com.bkgc.bean.lottery;

import java.util.Date;

public class LottoJkpAwardRule {
    private String id;

    private Integer type;

    private String checkerid;

    private String tickettype;

    private Date starttime;

    private Date endtime;

    private String checktimes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCheckerid() {
        return checkerid;
    }

    public void setCheckerid(String checkerid) {
        this.checkerid = checkerid == null ? null : checkerid.trim();
    }

    public String getTickettype() {
        return tickettype;
    }

    public void setTickettype(String tickettype) {
        this.tickettype = tickettype == null ? null : tickettype.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getChecktimes() {
        return checktimes;
    }

    public void setChecktimes(String checktimes) {
        this.checktimes = checktimes == null ? null : checktimes.trim();
    }
}