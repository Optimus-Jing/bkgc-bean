package com.bkgc.bean.pay;

/**
 * <p>Title:      InOutWayEnum </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/6/13 上午9:27
 */
public enum InOutWayEnum {
    //In_Bless(11, "收入：福金福包"),
    In_Prize(12, "收入：彩票兑奖"),
    In_Alipay_Charge(13, "收入：支付宝充值"),
    In_Wechat_Charge(14, "收入：微信充值"),
    In_Bless_Refund(15, "收入：过期福包退款"),
    //In_Pay_Refund(16, "收入：支付退款"),
    In_Bless_Cash(17, "收入：现金福包"),
    In_Bless_Transfer(18, "收入：福包转入"),
    In_Pay_Bless_Refund(19, "收入：福包兑换退款"),
    In_Pay_Alipay_Refund(20, "收入：支付宝支付退款"),
    In_Pay_Wechat_Refund(21, "收入：微信支付退款"),
    In_BusinessAccount_Recharge(22, "收入：企业福包账户充值"),
    In_Game_Award_Bless(23, "收入：夺宝福包"),
    In_Game_Award_Double(24, "收入：夺宝奖金翻倍"),
    In_Mch_LotteryBuy_Refund(41, "收入：福包进彩退款"),
    In_Mch_Sale_Cash_Settle(42, "收入：本金结算"),
    In_Mch_Sale_Commission_Settle(43, "收入：佣金结算"),

    //Out_Scan_Pay(51, "支出：扫码支付"),
    //Out_Withdraw(52, "支出：提现"),
    Out_Bless_Buy(53, "支出：发福包"),
    //Out_Bless_Spec(54, "支出：专用包支出"),
    //Out_Lottery_Buy(55, "支出：彩票支付"),
    //Out_Pay_Spec(56, "支出：专用消费"),
    Out_Bless_Transfer(57, "支出：福包转出"),
    Out_Wechat_Scan_Pay(58, "支出：微信扫码支付"),
    Out_Alipay_Scan_Pay(59, "支出：支付宝扫码支付"),
    Out_Fujin_Scan_Pay(60, "支出：福包兑换"),
    Out_Wechat_Withdraw(61, "支出：微信提现"),
    Out_Alipay_Withdraw(62, "支出：支付宝提现"),
    Out_Bless_Game_Pay(63, "支出：福包夺宝"),
    Out_Mch_Wechat_Withdraw(64, "支出：微信提现"),

    Out_Mch_Bless_LotteryBuy(81, "支出：福包进彩"),
    Out_Mch_Wechat_LotteryBuy(82, "支出：微信进彩"),;


    private int key;

    private String desc;

    InOutWayEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }


    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
