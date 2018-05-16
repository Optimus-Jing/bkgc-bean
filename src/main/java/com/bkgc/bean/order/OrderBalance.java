package com.bkgc.bean.order;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class OrderBalance extends PageParam {

    private static final long serialVersionUID = 1L;


    private String OrderDate;//结算日期
    private String channelName;//渠道商名称
    private Integer machineId; //自助机编码
    private Integer count_Wechat;//微信_支付笔数
    private double pay_Wechat;//微信_支付金额
    private double pay_Wechat_out;//微信_出票成功金额
    private Integer count_alipay;//支付宝_支付笔数
    private double pay_alipay;//支付宝_支付金额
    private double pay_alipay_out;//支付宝_出票成功金额
    private Integer count_fujin;//福金_支付笔数
    private double pay_fujin;//福金_支付金额
    private double pay_fujin_out;//福金_出票成功金额

}
