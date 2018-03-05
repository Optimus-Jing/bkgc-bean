package com.bkgc.bean.pay;

/**
 * <p>Title:      BussinessTypeEnum </p>
 * <p>Description  业务类型枚举</p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/6/8 下午4:46
 */
public enum BussinessTypeEnum {

    Pay("0" ,"支付") ,

    Refund("1" ,"退款") ,

    Withdraw("2" ,"提现") ,

    Recharge("3" ,"充值") ,

    Transfer("4" ,"转账"),

    Prize("5" ,"兑奖"),

    ;

    private String key;
    private String value;

    BussinessTypeEnum(String key,String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
