package com.bkgc.bean.machine;

import lombok.Data;

import java.util.Date;

@Data
public class AisleDailyBackup {
    private Integer id;

    private String name;

    private Integer capacity;

    private String aisleType;

    private Integer count;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private Integer currentLayer;

    private Integer machineProductId;

    private Integer machineId;

    private Integer operate;

    private Integer userId;

    private Date backupTime;

}