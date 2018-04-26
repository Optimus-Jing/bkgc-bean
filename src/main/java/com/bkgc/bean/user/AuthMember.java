package com.bkgc.bean.user;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AuthMember extends PageParam implements Serializable {
    private static final long serialVersionUID = -2581096918129183996L;

    private String id;

    private String name;

    private String nickname;

    private String gender;

    private String phone;

    private String email;

    private String idcardnumber;

    private String weixinopenid;

    private String qqopenid;

    private String address;

    private String postcode;

    private String loginid;

    private Integer iscertification;

    private Date createtime;

    private String facephotopath;

    private String personimageurl;

    private String guid;

    private String createtimeStr;

    private String unionId;

    public AuthMember() {
        super();
    }


    public AuthMember(String id, String nickname) {
        this();
        this.id = id;
        this.nickname = nickname;
    }

    public AuthMember(String id, String nickname, String phone, Integer iscertification, Date createTime, String loginid) {
        this.id = id;
        this.nickname = nickname;
        this.phone = phone;
        this.iscertification = iscertification;
        this.createtime = createTime;
        this.loginid = loginid;
    }

    public AuthMember(String id, String nickname, String phone, Integer iscertification, Date createTime) {
        this.id = id;
        this.nickname = nickname;
        this.phone = phone;
        this.iscertification = iscertification;
        this.createtime = createTime;
    }

}