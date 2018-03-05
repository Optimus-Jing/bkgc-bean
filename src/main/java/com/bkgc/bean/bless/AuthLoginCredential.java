package com.bkgc.bean.bless;

import java.util.Date;

public class AuthLoginCredential {
    private String id;

    private String username;

    private String password;

    private Integer usertype;

    private String userid;

    private Date lastlogintime;

    private Integer status;

    private String lastloginphonemodel;

    private String manufacturer;

    private String phoneuuid;

    private String platform;

    private String hwtoken;

    private String paypassword;
    
    public AuthLoginCredential() {
    	super();
	}
    
    public AuthLoginCredential(String lastloginphonemodel,String manufacturer,String phoneuuid,String platform,String hwtoken, String userid) {
    	this();
    	this.userid = userid;
    	this.lastloginphonemodel=lastloginphonemodel;
    	this.manufacturer=manufacturer;
    	this.phoneuuid= phoneuuid;
    	this.platform=platform;
    	this.hwtoken=hwtoken;
    }

    public AuthLoginCredential(String id, String username, String password, int usertype, String userid, int status,
			Date lastlogintime) {
    	this.id=id;
    	this.username=username;
    	this.password=password;
    	this.usertype=usertype;
    	this.userid=userid;
    	this.status=status;
    	this.lastlogintime=lastlogintime;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLastloginphonemodel() {
        return lastloginphonemodel;
    }

    public void setLastloginphonemodel(String lastloginphonemodel) {
        this.lastloginphonemodel = lastloginphonemodel == null ? null : lastloginphonemodel.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getPhoneuuid() {
        return phoneuuid;
    }

    public void setPhoneuuid(String phoneuuid) {
        this.phoneuuid = phoneuuid == null ? null : phoneuuid.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getHwtoken() {
        return hwtoken;
    }

    public void setHwtoken(String hwtoken) {
        this.hwtoken = hwtoken == null ? null : hwtoken.trim();
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }
}