package com.bkgc.bean.settle;

import com.bkgc.bean.ExcelResources;
import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by yanqiang on 2017/11/9.
 */
@Data
public class DeviceSettleVO extends PageParam {


    private String id;

    private String settleNo;

    private Date startDate;

    private String startDateStr;

    private String storeName;

    private String oneLevelChannel;

    private Date endDate;

    private String endDateStr;

    private Date settleTime;

    private String device;

    private BigDecimal wxAmount;

    private BigDecimal aliAmount;

    private BigDecimal blessAmount;

    private BigDecimal totalAmount;

    private BigDecimal paymentWxAmount;

    private BigDecimal paymentAliAmount;

    private BigDecimal paymentBlessAmount;

    private BigDecimal paymentTotalAmount;

    private BigDecimal thirdWxAmount;

    private BigDecimal thirdAliAmount;

    private BigDecimal thirdBlessAmount;

    private BigDecimal thirdTotalAmount;

    private BigDecimal diffAmount;

    private String diffReason;

    private BigDecimal settleAmount;

    private int settleStatus;

    private String operator;

    private Date operTime;

    private String settleUsername;

    private String settleUserId;

    private String settleMchId;

    private String settleMchName;

    private int settleState;

    public DeviceSettleVO() {
        super();
    }

    public DeviceSettleVO(Date startDate, Date endDate) {
        this();
        this.startDate = startDate;
        this.endDate = endDate;
        Calendar calendar = Calendar.getInstance();
        this.settleTime = calendar.getTime();
        calendar.setTime(startDate);
        this.settleNo = new SimpleDateFormat("yyyy-MM-dd").format(startDate);
        this.setWxAmount(new BigDecimal(0));
        this.setAliAmount(new BigDecimal(0));
        this.setBlessAmount(new BigDecimal(0));
        this.setThirdAliAmount(new BigDecimal(0));
        this.setThirdBlessAmount(new BigDecimal(0));
        this.setThirdWxAmount(new BigDecimal(0));
        this.setTotalAmount(new BigDecimal(0));
        this.setThirdTotalAmount(new BigDecimal(0));
        this.setPaymentTotalAmount(new BigDecimal(0));
        this.setPaymentWxAmount(new BigDecimal(0));
        this.setPaymentAliAmount(new BigDecimal(0));
        this.setPaymentBlessAmount(new BigDecimal(0));

    }

    public DeviceSettleVO(String settleNo, String startDateStr, String endDateStr,
                          String device, BigDecimal totalAmount, BigDecimal paymentTotalAmount, BigDecimal thirdTotalAmount,
                          BigDecimal diffAmount, BigDecimal settleAmount) {
        this.settleNo = settleNo;
        this.startDateStr = startDateStr;
        this.endDateStr = endDateStr;
        this.device = device;
        this.totalAmount = totalAmount;
        this.paymentTotalAmount = paymentTotalAmount;
        this.thirdTotalAmount = thirdTotalAmount;
        this.diffAmount = diffAmount;
        this.settleAmount = settleAmount;
    }

    @ExcelResources(title = "结算流水号", order = 1)
    public String getSettleNo() {
        return settleNo;
    }

    @ExcelResources(title = "设备名称", order = 4)
    public String getDevice() {
        return device;
    }

    @ExcelResources(title = "vem总金额", order = 5)
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    @ExcelResources(title = "第三方总金额", order = 7)
    public BigDecimal getThirdTotalAmount() {
        return thirdTotalAmount;
    }

    @ExcelResources(title = "差额", order = 8)
    public BigDecimal getDiffAmount() {
        return diffAmount;
    }

    @ExcelResources(title = "payment总金额", order = 6)
    public BigDecimal getPaymentWxAmount() {
        return paymentWxAmount;
    }

    @ExcelResources(title = "应结金额", order = 9)
    public BigDecimal getSettleAmount() {
        return settleAmount;
    }

    @ExcelResources(title = "起始时间", order = 2)
    public String getStartDateStr() {
        return startDateStr;
    }

    @ExcelResources(title = "结束时间", order = 3)
    public String getEndDateStr() {
        return endDateStr;
    }


}
