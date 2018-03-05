package com.bkgc.bean.lottery;

import java.util.Date;

import com.bkgc.bean.PageParam;

public class LottoJkpAwardOrder extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7979149037529632780L;

	private String id;

    private String userid;
    
    private String phone;
    
    private String awardticketid;

    private Date requesttime;

    private String requestlocation;

    private Integer awardstatus;

    private Integer awardlevel;

    private Integer awardmoney;

    private Integer checkmoney;

    private String checkerid;

    private String checkerip;

    private Date checktime;

    private String awarderid;

    private Date awardtime;

    private String awarderip;

    private Integer islocked;
    
    private Date lockExpired;

    private String validcode;

    private String remark;

    private String lottosn;

    private String imgpath;

    private String tickettype;

    private String barcode;

    private String correctedimgpath;

    private String originstr;
    
    private String ticketNumber;

    private String awardCode;
    
    private Integer pageSize ; //每一页大小
    private Integer pageStart;//开始页数
    
    private String tenMinsBefore;
    
    private String scannerResultImagePath; //识别扫码枪兑奖结果图片存储相对路径
    
    private int awardRecognitionResult;//扫码枪识别结果 
    
    private String awardRecognitionTime;//扫码识别时间
    
    private Integer process;//处理进程
    
    private Integer awardResultType; //兑奖结果类型
    
    private String appVersion;//兑奖使用app版本

    public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageStart() {
		return pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
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
    
    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone==null ? null : phone.trim();
	}

	public String getAwardticketid() {
        return awardticketid;
    }

    public void setAwardticketid(String awardticketid) {
        this.awardticketid = awardticketid == null ? null : awardticketid.trim();
    }

    public Date getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(Date requesttime) {
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

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getAwarderid() {
        return awarderid;
    }

    public void setAwarderid(String awarderid) {
        this.awarderid = awarderid == null ? null : awarderid.trim();
    }

    public Date getAwardtime() {
        return awardtime;
    }

    public void setAwardtime(Date awardtime) {
        this.awardtime = awardtime;
    }

    public String getAwarderip() {
        return awarderip;
    }

    public void setAwarderip(String awarderip) {
        this.awarderip = awarderip == null ? null : awarderip.trim();
    }

    public Integer getIslocked() {
        return islocked;
    }

    public void setIslocked(Integer islocked) {
        this.islocked = islocked;
    }

    public Date getLockExpired() {
		return lockExpired;
	}

	public void setLockExpired(Date lockExpired) {
		this.lockExpired = lockExpired;
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
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getCorrectedimgpath() {
        return correctedimgpath;
    }

    public void setCorrectedimgpath(String correctedimgpath) {
        this.correctedimgpath = correctedimgpath == null ? null : correctedimgpath.trim();
    }

    public String getOriginstr() {
        return originstr;
    }

    public void setOriginstr(String originstr) {
        this.originstr = originstr == null ? null : originstr.trim();
    }

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getAwardCode() {
		return awardCode;
	}

	public void setAwardCode(String awardCode) {
		this.awardCode = awardCode;
	}

	public String getTenMinsBefore() {
		return tenMinsBefore;
	}

	public void setTenMinsBefore(String tenMinsBefore) {
		this.tenMinsBefore = tenMinsBefore;
	}

	public String getScannerResultImagePath() {
		return scannerResultImagePath;
	}

	public void setScannerResultImagePath(String scannerResultImagePath) {
		this.scannerResultImagePath = scannerResultImagePath;
	}

	public int getAwardRecognitionResult() {
		return awardRecognitionResult;
	}

	public void setAwardRecognitionResult(int awardRecognitionResult) {
		this.awardRecognitionResult = awardRecognitionResult;
	}

	public String getAwardRecognitionTime() {
		return awardRecognitionTime;
	}

	public void setAwardRecognitionTime(String awardRecognitionTime) {
		this.awardRecognitionTime = awardRecognitionTime;
	}

	public Integer getProcess() {
		return process;
	}

	public void setProcess(Integer process) {
		this.process = process;
	}

	public Integer getAwardResultType() {
		return awardResultType;
	}

	public void setAwardResultType(Integer awardResultType) {
		this.awardResultType = awardResultType;
	}

	@Override
	public String toString() {
		return " {id=" + id + ", userid=" + userid + ", awardticketid=" + awardticketid
				+ ", requesttime=" + requesttime +  ", awardstatus="+ awardstatus 
				+ ", lottosn=" + lottosn + ", barcode="+ barcode + ", ticketNumber="+ ticketNumber 
				+ ", awardlevel=" + awardlevel + ", awardmoney=" + awardmoney + ", checkmoney="+ ", remark=" + remark
				+ checkmoney + ", checkerid=" + checkerid + ", checkerip=" + checkerip + ", checktime=" + checktime
				+ ", awarderid=" + awarderid + ", awardtime=" + awardtime + ", awarderip=" + awarderip + ", islocked="
				+ islocked + ", lockExpired=" + lockExpired + ", validcode=" + validcode 
				+ ", imgpath=" + imgpath + ", tickettype=" + tickettype  + ", process=" + process + "}";
	}
 
}