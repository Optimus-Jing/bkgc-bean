package com.bkgc.bean.user;

import com.bkgc.bean.User;
import lombok.Data;

import java.util.Date;

@Data
public class AuthCompany extends User {

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

}