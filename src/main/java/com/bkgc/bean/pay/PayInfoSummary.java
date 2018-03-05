package com.bkgc.bean.pay;

import java.math.BigDecimal;
import java.util.Arrays;

public class PayInfoSummary {

	//彩票兑奖
	private BigDecimal totalGainAward;

	//企业账户充值
	private BigDecimal totalMchBless;

	//福包支付退款
	private BigDecimal totalRefundBlessPay;

	//领取福包
	private BigDecimal totalBlessPackage;

	//第三方购彩
	private BigDecimal totalThirdPay;

	//过期福包退款
	private BigDecimal totalrefundExpiredPackage;

	//支付宝/微信充值
	private BigDecimal totalThirdRechage;

	//支付宝/微信提现
	private BigDecimal totalWithdrawToThird;

	//用户购彩
	private BigDecimal totalBlessPay;

	//商户福包支付
	private BigDecimal totalInstockBless;

	//发福包
	private BigDecimal totalPayVoucher;

	private BigDecimal totalRefund;


	//向北控国彩微信、支付 宝账户充值累计额度
	private BigDecimal bkgcRecharge;

	//从北控国彩微信、支付宝账户提现累计额度
	private BigDecimal bkgcWithdraw;

	//累计收入
	private BigDecimal income;

	//累计支付
	private BigDecimal expend;

	private String[] array ;

	private String startTime;
	private String endTime;


	public PayInfoSummary() {
		super();
		array=new String[13];
	}

	public BigDecimal getBkgcRecharge() {
		return bkgcRecharge;
	}

	public void setBkgcRecharge(BigDecimal bkgcRecharge) {
		array[11]="微信、支付宝企业充值";
		this.bkgcRecharge = bkgcRecharge;
	}

	public BigDecimal getBkgcWithdraw() {
		return bkgcWithdraw;
	}

	public void setBkgcWithdraw(BigDecimal bkgcWithdraw) {
		array[12]="企业提现";
		this.bkgcWithdraw = bkgcWithdraw;
	}
	public BigDecimal getIncome() {
		return income;
	}


	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public BigDecimal getExpend() {
		return expend;
	}

	public void setExpend(BigDecimal expend) {
		this.expend = expend;
	}

	public BigDecimal getTotalThirdPay() {
		return totalThirdPay;
	}

	public void setTotalThirdPay(BigDecimal totalThirdPay) {
		array[10]="第三方购彩";
		this.totalThirdPay = totalThirdPay;
	}



	public BigDecimal getTotalInstockBless() {
		return totalInstockBless;
	}

	public void setTotalInstockBless(BigDecimal totalInstockBless) {
		array[9]="商户福包支付";
		this.totalInstockBless = totalInstockBless;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public BigDecimal getTotalGainAward() {
		return totalGainAward;
	}

	public void setTotalGainAward(BigDecimal totalGainAward) {
		array[0]="彩票兑奖";
		this.totalGainAward = totalGainAward;
	}

	public BigDecimal getTotalMchBless() {
		return totalMchBless;
	}

	public void setTotalMchBless(BigDecimal totalMchBless) {
		array[1]="企业账户充值";
		this.totalMchBless = totalMchBless;
	}

	public BigDecimal getTotalRefundBlessPay() {
		return totalRefundBlessPay;
	}

	public void setTotalRefundBlessPay(BigDecimal totalRefundBlessPay) {
		array[2]="福包支付退款";
		this.totalRefundBlessPay = totalRefundBlessPay;
	}

	public BigDecimal getTotalBlessPackage() {
		return totalBlessPackage;
	}

	public void setTotalBlessPackage(BigDecimal totalBlessPackage) {
		array[3]="领取福包";
		this.totalBlessPackage = totalBlessPackage;
	}

	public BigDecimal getTotalrefundExpiredPackage() {
		return totalrefundExpiredPackage;
	}

	public void setTotalrefundExpiredPackage(BigDecimal totalrefundExpiredPackage) {
		array[4]="过期福包退款";
		this.totalrefundExpiredPackage = totalrefundExpiredPackage;
	}

	public BigDecimal getTotalThirdRechage() {
		return totalThirdRechage;
	}

	public void setTotalThirdRechage(BigDecimal totalThirdRechage) {
		array[5]="支付宝/微信充值";
		this.totalThirdRechage = totalThirdRechage;
	}

	public BigDecimal getTotalWithdrawToThird() {
		return totalWithdrawToThird;
	}

	public void setTotalWithdrawToThird(BigDecimal totalWithdrawToThird) {
		array[6]="支付宝/微信提现";
		this.totalWithdrawToThird = totalWithdrawToThird;
	}

	public BigDecimal getTotalBlessPay() {
		return totalBlessPay;
	}

	public void setTotalBlessPay(BigDecimal totalBlessPay) {
		array[7]="用户购彩";
		this.totalBlessPay = totalBlessPay;
	}

	public BigDecimal getTotalPayVoucher() {
		return totalPayVoucher;
	}

	public void setTotalPayVoucher(BigDecimal totalPayVoucher) {
		array[8]="发福包";
		this.totalPayVoucher = totalPayVoucher;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public BigDecimal getTotalRefund() {
		return totalRefund;
	}

	public void setTotalRefund(BigDecimal totalRefund) {
		this.totalRefund = totalRefund;
	}

	@Override
	public String toString() {
		return "PayInfoSummary{" +
				"totalGainAward=" + totalGainAward +
				", totalMchBless=" + totalMchBless +
				", totalRefundBlessPay=" + totalRefundBlessPay +
				", totalBlessPackage=" + totalBlessPackage +
				", totalThirdPay=" + totalThirdPay +
				", totalrefundExpiredPackage=" + totalrefundExpiredPackage +
				", totalThirdRechage=" + totalThirdRechage +
				", totalWithdrawToThird=" + totalWithdrawToThird +
				", totalBlessPay=" + totalBlessPay +
				", totalInstockBless=" + totalInstockBless +
				", totalPayVoucher=" + totalPayVoucher +
				", totalRefund=" + totalRefund +
				", bkgcRecharge=" + bkgcRecharge +
				", bkgcWithdraw=" + bkgcWithdraw +
				", income=" + income +
				", expend=" + expend +
				", array=" + Arrays.toString(array) +
				", startTime='" + startTime + '\'' +
				", endTime='" + endTime + '\'' +
				'}';
	}
}
