package com.bkgc.bean.award;


public enum AwardStatusEnum {

    Wait_Award(0, "等待兑奖"),
    Award_Success(1, "兑奖处理成功"),
    Award_Fail(2, "兑奖处理失败"),;

    private int code;
    private String value;

    AwardStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
