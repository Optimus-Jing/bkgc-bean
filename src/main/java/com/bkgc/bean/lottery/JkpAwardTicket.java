package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;

public class JkpAwardTicket extends PageParam{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4280232057817845940L;

	private String id;

    private String lottosn;

    private String imgpath;

    private String tickettype;
    
    private String barcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLottosn() {
        return lottosn;
    }

    public void setLottosn(String lottosn) {
        this.lottosn = lottosn == null ? null : lottosn.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }
    
    public String getTickettype() {
        return tickettype;
    }

    public void setTickettype(String tickettype) {
        this.tickettype = tickettype == null ? null : tickettype.trim();
    }

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
    
    
}