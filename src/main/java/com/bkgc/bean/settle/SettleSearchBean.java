package com.bkgc.bean.settle;

/**
 * Created by yanqiang on 2017/11/16.
 */
public class SettleSearchBean {

    private String settleNo;

    private String startDate;

    private String endDate;

    private String deviceId;

    private Integer pageStart;

    private Integer pageSize;

    private String operator;

    private String deviceSettleId;

    public String getSettleNo() {
        return settleNo;
    }

    public void setSettleNo(String settleNo) {
        this.settleNo = settleNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getPageStart() {
        return pageStart;
    }

    public void setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDeviceSettleId() {
        return deviceSettleId;
    }

    public void setDeviceSettleId(String deviceSettleId) {
        this.deviceSettleId = deviceSettleId;
    }
}
