package com.bkgc.bean.pay;

/**
 * <p>Title:      PayTimeOut </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/6/7 下午2:38
 */
public enum PayTimeOutEnum {
    FujinPay_Timeout("1",60),
    Alipay_Timeout("2",60),
    WechatPay_Timeout("3",60);

    private String key;

    private int value;

    PayTimeOutEnum(String key, int value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
