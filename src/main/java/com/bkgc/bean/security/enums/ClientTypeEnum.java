package com.bkgc.bean.security.enums;

/**
 * <p>Title:      ClientTypeEnum </p>
 * <p>Description 客户端类型 </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/6/28 下午2:03
 */
public enum ClientTypeEnum {

    Bless_Android_App("10", "福包App安卓端"),
    Bless_IOS_App("11", "福包App苹果端"),
    Bkgc_Vemtp("12", "自助机接口系统"),
    Bkgc_Machine("13", "自助机管理系统"),
    Bkgc_Bless("14", "福包系统"),
    Bkgc_Payment("15", "支付系统"),
    Bkgc_Message("16", "消息系统"),
    Bkgc_Channel("17", "渠道管理"),
    Bkgc_Award("18", "兑奖系统"),
    Bkgc_Vemmp("19", "兑奖系统"),
    Bkgc_Advertisement("20", "国彩广告播控平台"),
    Bkgc_AgentService("21", "国彩商户服务支持平台"),
    Bkgc_BlessManage("22", "福包管理系统"),
    Bkgc_OrderManage("23", "订单系统"),
    Bkgc_VemApp("24", "安卓版自助机"),
    Bkgc_MiniProManage("25", "小程序后台"),
    Bkgc_Basa("26", "商户助手后台"),
    Bkgc_Vem("27", "自助机后台"),
    Bkgc_Lottery_InBase("28", "彩票入库"),
    Bkgc_BasaMp("29", "商户助手小程序"),;

    private String key;

    private String desc;

    ClientTypeEnum(String key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
