package com.bkgc.bean.pay;

import java.math.BigDecimal;

import com.bkgc.bean.PageParam;

public class PayCompany extends PageParam{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -939528662284598350L;

	private String ids;

    private String companyname;

    private String email;

    private String username;

    private String password;

    private String secretkey;

    private BigDecimal maxcount;

    private String remark;

    private String rsapublickey;

    private String rsaprivatekey;

    private String companyid;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey == null ? null : secretkey.trim();
    }

    public BigDecimal getMaxcount() {
        return maxcount;
    }

    public void setMaxcount(BigDecimal maxcount) {
        this.maxcount = maxcount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRsapublickey() {
        return rsapublickey;
    }

    public void setRsapublickey(String rsapublickey) {
        this.rsapublickey = rsapublickey == null ? null : rsapublickey.trim();
    }

    public String getRsaprivatekey() {
        return rsaprivatekey;
    }

    public void setRsaprivatekey(String rsaprivatekey) {
        this.rsaprivatekey = rsaprivatekey == null ? null : rsaprivatekey.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }
}