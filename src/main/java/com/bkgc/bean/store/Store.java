package com.bkgc.bean.store;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class Store extends PageParam {

    private static final long serialVersionUID = -6077197106715476502L;

    private int id;

    private String name;

    private String phone;

    private String fixPhone;

    private String fax;

    private String mail;

    private String address;

    private String postcode;

    private String contact;

    private String contactPhone;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private Integer channelId;

    private Integer status;

    private String longitude;

    private String latitude;

    private String imgUrl;

    private String description;

    private Date createTimeStart;

    private Date createTimeEnd;

    private String channelName;

    private Integer regionCode;

}