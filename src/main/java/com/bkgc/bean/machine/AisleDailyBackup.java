package com.bkgc.bean.machine;

import java.util.Date;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getAisleType() {
        return aisleType;
    }

    public void setAisleType(String aisleType) {
        this.aisleType = aisleType == null ? null : aisleType.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getCurrentLayer() {
        return currentLayer;
    }

    public void setCurrentLayer(Integer currentLayer) {
        this.currentLayer = currentLayer;
    }

    public Integer getMachineProductId() {
        return machineProductId;
    }

    public void setMachineProductId(Integer machineProductId) {
        this.machineProductId = machineProductId;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Integer getOperate() {
        return operate;
    }

    public void setOperate(Integer operate) {
        this.operate = operate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(Date backupTime) {
        this.backupTime = backupTime;
    }
}