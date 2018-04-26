package com.bkgc.bean.pay;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by yanqiang on 2017/11/29.
 */
@Data
public class PayDataExchangeSummary extends PayInfoSummary {

    //向北控国彩微信、支付 宝账户充值累计额度
    private BigDecimal bkgcRecharge;

    //从北控国彩微信、支付宝账户提现累计额度
    private BigDecimal bkgcWithdraw;

    //累计收入
    private BigDecimal income;

    //累计支付
    private BigDecimal expend;

    public void setBkgcRecharge(BigDecimal bkgcRecharge) {
        super.getArray()[11] = "微信、支付宝企业充值";
        this.bkgcRecharge = bkgcRecharge;
    }

    public void setBkgcWithdraw(BigDecimal bkgcWithdraw) {
        super.getArray()[12] = "企业提现";
        this.bkgcWithdraw = bkgcWithdraw;
    }
}
