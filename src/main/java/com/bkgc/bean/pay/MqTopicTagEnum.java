package com.bkgc.bean.pay;

/**
 * <p>Title:      MqTopicTagEnum </p>
 * <p>Description 消息topic和tag枚举 </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/6/23 上午10:02
 */
public enum MqTopicTagEnum {

    PAY_NOTIFY_FUJINPAY("Topic_BKGC_Dev_Payment_Notify","FujinPay"),
    PAY_NOTIFY_WechatPay("Topic_BKGC_Dev_Payment_Notify","WechatPay"),
    PAY_NOTIFY_Alipay("Topic_BKGC_Dev_Payment_Notify","Alipay"),
    PAY_NOTIFY_Advertisement("Topic_BKGC_Dev_Mini_Program_Business_AD_Notify","TAG_AD"),
    PAY_NOTIFY_Business("Topic_BKGC_Dev_Mini_Program_Business_AD_Notify","TAG_Business"),

    ;

    private String topic;

    private String tag;

    MqTopicTagEnum(String topic, String tag) {
        this.topic = topic;
        this.tag = tag;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
