package com.bkgc.bean.pay;

import java.math.BigDecimal;
import java.util.Date;

import com.bkgc.bean.PageParam;

public class PayOrders extends PageParam {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5881124321360470068L;

	private String ids;

    private String payorderid;

    private String a002Ids;

    private String deviceinfo;

    private Integer machineId;

    private String outTradeNo;

    private Date createtime;

    private String body;

    private String notifyUrl;

    private String returnUrl;

    private String sellerEmail;

    private String showUrl;

    private String subject;

    private BigDecimal fee;

    private Integer orderstatus;

    private Date finishtime;

    private String userid;

    private String fromaccount;
    
    private String companyname;
    
    public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public String getPayorderid() {
        return payorderid;
    }

    public void setPayorderid(String payorderid) {
        this.payorderid = payorderid == null ? null : payorderid.trim();
    }

    public String getA002Ids() {
        return a002Ids;
    }

    public void setA002Ids(String a002Ids) {
        this.a002Ids = a002Ids == null ? null : a002Ids.trim();
    }

    public String getDeviceinfo() {
        return deviceinfo;
    }

    public void setDeviceinfo(String deviceinfo) {
        this.deviceinfo = deviceinfo == null ? null : deviceinfo.trim();
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl == null ? null : returnUrl.trim();
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail == null ? null : sellerEmail.trim();
    }

    public String getShowUrl() {
        return showUrl;
    }

    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl == null ? null : showUrl.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getFromaccount() {
        return fromaccount;
    }

    public void setFromaccount(String fromaccount) {
        this.fromaccount = fromaccount == null ? null : fromaccount.trim();
    }
}