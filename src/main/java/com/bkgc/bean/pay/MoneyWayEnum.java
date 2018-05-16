package com.bkgc.bean.pay;

/**
 * <p>Title:      MoneyWayEnum </p>
 * <p>Description  转入转出类型枚举</p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/6/8 下午4:46
 */
public enum MoneyWayEnum {

    In("0", "转入"),

    Out("1", "转出"),;

    private String key;
    private String value;

    MoneyWayEnum(String key, String value) {
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
