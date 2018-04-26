package com.bkgc.bean.machine;

import lombok.Data;

import java.util.Date;

@Data
public class MachienInfoLog {
    private Integer id;

    private Date updateTime;

    private Integer oldMachineId;

    private Integer newMachineId;

    private Date createTime;

    private Integer isDelete;
}