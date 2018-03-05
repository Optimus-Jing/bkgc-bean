package com.bkgc.bean.pay;

import java.math.BigDecimal;
import com.bkgc.bean.pay.PayInfoSummary;
/**
 * Created by yanqiang on 2017/11/29.
 */
public class PayDataExchangeSummary extends PayInfoSummary{
	
	//向北控国彩微信、支付 宝账户充值累计额度
    private BigDecimal bkgcRecharge;

    //从北控国彩微信、支付宝账户提现累计额度
    private BigDecimal bkgcWithdraw;

    //累计收入
    private BigDecimal income;

    //累计支付
    private BigDecimal expend;

    public BigDecimal getBkgcRecharge() {
        return bkgcRecharge;
    }

    public void setBkgcRecharge(BigDecimal bkgcRecharge) {
    	super.getArray()[11]="微信、支付宝企业充值";
        this.bkgcRecharge = bkgcRecharge;
    }

    public BigDecimal getBkgcWithdraw() {
        return bkgcWithdraw;
    }

    public void setBkgcWithdraw(BigDecimal bkgcWithdraw) {
    	super.getArray()[12]="企业提现";
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
}
