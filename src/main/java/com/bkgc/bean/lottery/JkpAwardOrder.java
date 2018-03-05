package com.bkgc.bean.lottery;
import java.sql.Timestamp;

import com.bkgc.bean.EntityBase;

public class JkpAwardOrder extends EntityBase
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3489436224880419225L;

	public class AwardStatus{
		public static final int WaitToCheck = 0; 
		public static final int IsChecking = 1;
		public static final int WaitToAward = 2;
		public static final int IsAwarding = 3;
		public static final int WaitToGetMoney = 4;
		public static final int GetAwardOver = 5;
		
		public static final int AwardIsGot = 10;
		
		public static final int CannotRecognized=999;
	};
	
	public class AwardType{
		public static final int NoAward = 0; 
		public static final int LitteAward = 1;
		public static final int BigAward = 2;
	};
	
	
	public class AwardResultType{
		public static final int Awarded = 1;  //兑奖成功
		public static final int AwardPriceOverOnlineHandlePrice = 2;//兑奖额度超出在线兑奖，提示用户去彩票中心兑奖
		public static final int NotAwarded = 3;//未中奖
	};
	
	
	
	private String id;

    private String userid;

    private String awardticketid;

    private Timestamp requesttime;

    private String requestlocation;

    private Integer awardstatus;

    private Integer awardlevel;

    private Integer awardmoney;

    private Integer checkmoney;

    private String checkerid;

    private String checkerip;

    private Timestamp checktime;

    private String awarderid;

    private Timestamp awardtime;

    private String awarderip;

    private String validcode;

    private String remark;
    
    private int islocked;
    
    private int awardResultType; //兑奖员处理结果类型

    //ticket info
    private String lottosn; //保安区码
    
    private String barcode; //非保安区码
    
    private String tickettype; //彩票种类

    private String imgpath; //原始图片位置
    
    private String correctedImgpath; //处理后的图片位置
    
    //recognition info
    private String originStr; //彩票识别的原始结果
    
    

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

    public String getAwardticketid() {
        return awardticketid;
    }

    public void setAwardticketid(String awardticketid) {
        this.awardticketid = awardticketid == null ? null : awardticketid.trim();
    }

    public Timestamp getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(Timestamp requesttime) {
        this.requesttime = requesttime;
    }

    public String getRequestlocation() {
        return requestlocation;
    }

    public void setRequestlocation(String requestlocation) {
        this.requestlocation = requestlocation == null ? null : requestlocation.trim();
    }

    public Integer getAwardstatus() {
        return awardstatus;
    }

    public void setAwardstatus(Integer awardstatus) {
        this.awardstatus = awardstatus;
    }

    public Integer getAwardlevel() {
        return awardlevel;
    }

    public void setAwardlevel(Integer awardlevel) {
        this.awardlevel = awardlevel;
    }

    public Integer getAwardmoney() {
        return awardmoney;
    }

    public void setAwardmoney(Integer awardmoney) {
        this.awardmoney = awardmoney;
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

    public Timestamp getChecktime() {
        return checktime;
    }
    
    public void setChecktime(Timestamp checktime) {
        this.checktime = checktime;
    }

    public String getAwarderid() {
        return awarderid;
    }

    public void setAwarderid(String awarderid) {
        this.awarderid = awarderid == null ? null : awarderid.trim();
    }

    public Timestamp getAwardtime() {
        return awardtime;
    }

    public void setAwardtime(Timestamp awardtime) {
        this.awardtime = awardtime;
    }

    public String getAwarderip() {
        return awarderip;
    }

    public void setAwarderip(String awarderip) {
        this.awarderip = awarderip == null ? null : awarderip.trim();
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
    
    public int getIslocked() {
        return islocked;
    }

    public void setIslocked(int islocked) {
        this.islocked = islocked;
    }

    public String getLottosn() {
        return lottosn;
    }

    public void setLottosn(String lottosn) {
        this.lottosn = lottosn == null ? null : lottosn.trim();
    }
    
    public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getTickettype() {
		return tickettype;
	}

	public void setTickettype(String tickettype) {
		this.tickettype = tickettype;
	}

	public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

	public String getOriginStr() {
		return originStr;
	}

	public void setOriginStr(String originStr) {
		this.originStr = originStr;
	}

	public int getAwardResultType() {
		return awardResultType;
	}

	public void setAwardResultType(int awardResultType) {
		this.awardResultType = awardResultType;
	}

	public String getCorrectedImgpath() {
		return correctedImgpath;
	}

	public void setCorrectedImgpath(String correctedImgpath) {
		this.correctedImgpath = correctedImgpath;
	}
    
    
    
}

