package com.bkgc.bean.pay;

/**
 * <p>Title:      PayStatusEnum </p>
 * <p>Description 支付状态</p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/6/7 上午10:09
 */
public enum PayStatusEnum {

    PAY_FAIL("-1", "失败"),
    PAY_WAIT("0", "待支付"),
    PAY_SUCCESS("1", "支付成功"),
    PAY_TIMEOUT("2", "支付超时"),
    PAY_REFUND("3", "转入退款");


    private String key;

    private String value;

    PayStatusEnum(String key,String value){
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
