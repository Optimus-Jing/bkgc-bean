package com.bkgc.bean.machine;

import java.util.Date;

public class MachienInfoLog {
    private Integer id;

    private Date updateTime;

    private Integer oldMachineId;

    private Integer newMachineId;

    private Date createTime;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOldMachineId() {
        return oldMachineId;
    }

    public void setOldMachineId(Integer oldMachineId) {
        this.oldMachineId = oldMachineId;
    }

    public Integer getNewMachineId() {
        return newMachineId;
    }

    public void setNewMachineId(Integer newMachineId) {
        this.newMachineId = newMachineId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}