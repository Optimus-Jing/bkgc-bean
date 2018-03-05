package com.bkgc.bean.settle;

/**
 * Created by yanqiang on 2017/11/17.
 */
public class OrderCheckParam {

    private String id;

    private String amount;

    private String operator;

    private String annotation;

    private String deviceSettleId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getDeviceSettleId() {
        return deviceSettleId;
    }

    public void setDeviceSettleId(String deviceSettleId) {
        this.deviceSettleId = deviceSettleId;
    }
}
