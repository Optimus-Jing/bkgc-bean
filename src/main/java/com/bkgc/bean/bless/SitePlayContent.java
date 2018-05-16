package com.bkgc.bean.bless;

import lombok.Data;

import java.util.Date;

@Data
public class SitePlayContent {
    private String id;

    private String title;

    private String imageurl;

    private Date createtime;

    private Integer contenttype;

    private String contentid;

    private Integer isshow;

    private Integer sortflag;
}