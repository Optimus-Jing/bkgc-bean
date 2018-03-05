package com.bkgc.bean.settle;

import java.math.BigDecimal;
import java.util.List;


/**
 * Created by yanqiang on 2017/11/10.
 */
public class WeekStatistics {

    /**
     * 以周为单位的统计编码
     */
    private String weekNo;


    /**
     * 统计周开始日期
     */
    private String startDate;

    /**
     * 统计周结束日期
     */
    private String endDate;

    /**
     * 自助机交易订单交易额汇总
     */
    private BigDecimal vemTotal;

    /**
     * 支付系统订单交易额汇总
     */
    private BigDecimal paymentTotal;

    /**
     * 第三方系统订单交易额汇总
     */
    private BigDecimal thirdTotal;

    /**
     * 应结算金额
     */
    private BigDecimal forSettle;

    private List<String> deviceList;



    /**
     * 核查数据结果状态(1.正常,0不正常)
     */
    private int status;

    /**
     * 需要结算的设备总数
     */
    private  int count;

//    private List<DeviceSettle> deviceSettles;

    public String getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(String weekNo) {
        this.weekNo = weekNo;
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

    public BigDecimal getVemTotal() {
        return vemTotal;
    }

    public void setVemTotal(BigDecimal vemTotal) {
        this.vemTotal = vemTotal;
    }

    public BigDecimal getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(BigDecimal paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public BigDecimal getThirdTotal() {
        return thirdTotal;
    }

    public void setThirdTotal(BigDecimal thirdTotal) {
        this.thirdTotal = thirdTotal;
    }

    public BigDecimal getForSettle() {
        return forSettle;
    }

    public void setForSettle(BigDecimal forSettle) {
        this.forSettle = forSettle;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

//    public List<DeviceSettle> getDeviceSettles() {
//        return deviceSettles;
//    }
//
//    public void setDeviceSettles(List<DeviceSettle> deviceSettles) {
//        this.deviceSettles = deviceSettles;
//    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<String> deviceList) {
        this.deviceList = deviceList;
    }
}
