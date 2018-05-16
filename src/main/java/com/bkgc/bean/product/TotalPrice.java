package com.bkgc.bean.product;

import lombok.Data;

@Data
public class TotalPrice {

    private double totalAlipay;//支付宝统计
    private double totalWechat;//微信统计
    private double totalFujinpay;//福金统计
    private double total2price;//20元区统计
    private double total5price;//50元区统计
    private double total0price;//100元区统计
}
