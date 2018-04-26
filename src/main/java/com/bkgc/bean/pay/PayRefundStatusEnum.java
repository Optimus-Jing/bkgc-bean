package com.bkgc.bean.pay;

/**
 * <p>Title:      PayRefundStatusEnum </p>
 * <p>Description 退款状态 </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/6/27 上午10:03
 */


public enum PayRefundStatusEnum {

    Refund_Audit(0, "申请审核中"),
    Refund_Success(1, "退款成功"),
    Refund_Fail(-1, "退款失败"),;

    PayRefundStatusEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    private int key;

    private String desc;

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
