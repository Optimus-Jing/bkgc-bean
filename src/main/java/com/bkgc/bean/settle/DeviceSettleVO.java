package com.bkgc.bean.settle;

import com.bkgc.bean.ExcelResources;
import com.bkgc.bean.PageParam;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by yanqiang on 2017/11/9.
 */

public class DeviceSettleVO extends PageParam{


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

    public DeviceSettleVO(){
        super();
    }

    public DeviceSettleVO(Date startDate, Date endDate){
        this();
        this.startDate = startDate;
        this.endDate = endDate;
        Calendar calendar = Calendar.getInstance();
        this.settleTime = calendar.getTime();
        calendar.setTime(startDate);
        this.settleNo =  new SimpleDateFormat("yyyy-MM-dd").format(startDate);
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

	public String getOneLevelChannel() {
		return oneLevelChannel;
	}

	public void setOneLevelChannel(String oneLevelChannel) {
		this.oneLevelChannel = oneLevelChannel;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @ExcelResources(title="结算流水号",order=1)
    public String getSettleNo() {
        return settleNo;
    }

    public void setSettleNo(String settleNo) {
        this.settleNo = settleNo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }
    @ExcelResources(title="设备名称",order=4)
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public BigDecimal getWxAmount() {
        return wxAmount;
    }

    public void setWxAmount(BigDecimal wxAmount) {
        this.wxAmount = wxAmount;
    }

    public BigDecimal getAliAmount() {
        return aliAmount;
    }

    public void setAliAmount(BigDecimal aliAmount) {
        this.aliAmount = aliAmount;
    }

    public BigDecimal getBlessAmount() {
        return blessAmount;
    }

    public void setBlessAmount(BigDecimal blessAmount) {
        this.blessAmount = blessAmount;
    }
    @ExcelResources(title="vem总金额",order=5)
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getThirdWxAmount() {
        return thirdWxAmount;
    }

    public void setThirdWxAmount(BigDecimal thirdWxAmount) {
        this.thirdWxAmount = thirdWxAmount;
    }

    public BigDecimal getThirdAliAmount() {
        return thirdAliAmount;
    }

    public void setThirdAliAmount(BigDecimal thirdAliAmount) {
        this.thirdAliAmount = thirdAliAmount;
    }

    public BigDecimal getThirdBlessAmount() {
        return thirdBlessAmount;
    }

    public void setThirdBlessAmount(BigDecimal thirdBlessAmount) {
        this.thirdBlessAmount = thirdBlessAmount;
    }
    @ExcelResources(title="第三方总金额",order=7)
    public BigDecimal getThirdTotalAmount() {
        return thirdTotalAmount;
    }

    public void setThirdTotalAmount(BigDecimal thirdTotalAmount) {
        this.thirdTotalAmount = thirdTotalAmount;
    }
    @ExcelResources(title="差额",order=8)
    public BigDecimal getDiffAmount() {
        return diffAmount;
    }

    public void setDiffAmount(BigDecimal diffAmount) {
        this.diffAmount = diffAmount;
    }

    public String getDiffReason() {
        return diffReason;
    }

    public void setDiffReason(String diffReason) {
        this.diffReason = diffReason;
    }

    public int getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(int settleStatus) {
        this.settleStatus = settleStatus;
    }
    @ExcelResources(title="payment总金额",order=6)
    public BigDecimal getPaymentWxAmount() {
        return paymentWxAmount;
    }

    public void setPaymentWxAmount(BigDecimal paymentWxAmount) {
        this.paymentWxAmount = paymentWxAmount;
    }

    public BigDecimal getPaymentAliAmount() {
        return paymentAliAmount;
    }

    public void setPaymentAliAmount(BigDecimal paymentAliAmount) {
        this.paymentAliAmount = paymentAliAmount;
    }

    public BigDecimal getPaymentBlessAmount() {
        return paymentBlessAmount;
    }

    public void setPaymentBlessAmount(BigDecimal paymentBlessAmount) {
        this.paymentBlessAmount = paymentBlessAmount;
    }
    @ExcelResources(title="应结金额",order=9)
    public BigDecimal getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(BigDecimal settleAmount) {
        this.settleAmount = settleAmount;
    }

    public BigDecimal getPaymentTotalAmount() {
        return paymentTotalAmount;
    }

    public void setPaymentTotalAmount(BigDecimal paymentTotalAmount) {
        this.paymentTotalAmount = paymentTotalAmount;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }
    @ExcelResources(title="起始时间",order=2)
    public String getStartDateStr() {
        return startDateStr;
    }

    public void setStartDateStr(String startDateStr) {
        this.startDateStr = startDateStr;
    }
    @ExcelResources(title="结束时间",order=3)
    public String getEndDateStr() {
        return endDateStr;
    }

    public void setEndDateStr(String endDateStr) {
        this.endDateStr = endDateStr;
    }
    
    
    
    
}
