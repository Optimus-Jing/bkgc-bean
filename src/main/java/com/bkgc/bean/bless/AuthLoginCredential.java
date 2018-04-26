package com.bkgc.bean.bless;

import lombok.Data;

import java.util.Date;

@Data
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

    public AuthLoginCredential(String lastloginphonemodel, String manufacturer, String phoneuuid, String platform, String hwtoken, String userid) {
        this();
        this.userid = userid;
        this.lastloginphonemodel = lastloginphonemodel;
        this.manufacturer = manufacturer;
        this.phoneuuid = phoneuuid;
        this.platform = platform;
        this.hwtoken = hwtoken;
    }

    public AuthLoginCredential(String id, String username, String password, int usertype, String userid, int status,
                               Date lastlogintime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.usertype = usertype;
        this.userid = userid;
        this.status = status;
        this.lastlogintime = lastlogintime;
    }
}