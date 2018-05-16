package com.bkgc.bean.machine;

import lombok.Data;

import java.util.Date;

@Data
public class MachineAdvertisement {
    private Integer id;

    private Integer adId;

    private String name;

    private String description;

    private Integer type;

    private String url;

    private Integer machineId;

    private Integer status;

    private Date startTime;

    private Date stopTime;

    private Integer playHz;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private Integer playSort;
}