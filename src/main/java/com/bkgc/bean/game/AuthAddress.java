package com.bkgc.bean.game;

import lombok.Data;

import java.util.Date;

@Data
public class AuthAddress {
    private String id;

    private String name;

    private String gender;

    private String phone;

    private String province;

    private String city;

    private String address;

    private String housenumber;

    private String postcode;

    private String createuserid;

    private Date createtime;

    private Integer isdefault;

    private String district;

    private String recipientId;

    private Date updateTime;

}