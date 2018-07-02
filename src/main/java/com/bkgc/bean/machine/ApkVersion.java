package com.bkgc.bean.machine;

import lombok.Data;

import java.util.Date;

@Data
public class ApkVersion {
    private Integer id;

    private Integer code;

    private String version;

    private String name;

    private String channel;

    private String description;

    private Date updateTime;

    private Date createTime;

    private String packageName;

    private Integer isDelete;

    private String url;

    private Integer isUpgrade;

    private Integer online;

    private Integer show;
}