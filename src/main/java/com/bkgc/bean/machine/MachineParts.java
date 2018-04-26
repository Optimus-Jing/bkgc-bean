package com.bkgc.bean.machine;

import lombok.Data;

import java.util.Date;

@Data
public class MachineParts {
    private Integer id;

    private Integer machineId;

    private Integer partsId;

    private Integer status;

    private Date updateTime;

    private Date createTime;

    private Integer isDelete;

    private Date installTime;
}