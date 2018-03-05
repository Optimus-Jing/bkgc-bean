package com.bkgc.bean.user;

import java.util.Date;

import com.bkgc.bean.User;

public class AuthCompany extends User{

    private String fax;

    private String address;

    private String postcode;

    private String contactperson;

    private String contactpersonphone;

    private String loginid;

    private Date createtime;

    private String logopath;

    private String campaignimageurl;

    private String createTimeStr;

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson == null ? null : contactperson.trim();
    }

    public String getContactpersonphone() {
        return contactpersonphone;
    }

    public void setContactpersonphone(String contactpersonphone) {
        this.contactpersonphone = contactpersonphone == null ? null : contactpersonphone.trim();
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLogopath() {
        return logopath;
    }

    public void setLogopath(String logopath) {
        this.logopath = logopath == null ? null : logopath.trim();
    }

    public String getCampaignimageurl() {
        return campaignimageurl;
    }

    public void setCampaignimageurl(String campaignimageurl) {
        this.campaignimageurl = campaignimageurl == null ? null : campaignimageurl.trim();
    }
}