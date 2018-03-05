package com.bkgc.bean.pay;

/**
 * <p>Title:      PayTypeEnum </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/6/7 下午4:41
 */
public enum PayTypeEnum {

    FujinPay("1", "福金支付"),

    AliPay("2", "支付宝支付"),

    WechatPay("3", "微信支付"),;

    private String key;

    private String value;

    PayTypeEnum(String key, String value) {
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
