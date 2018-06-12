package com.bkgc.bean.vem;

import lombok.Data;

import java.util.Date;


@Data
public class VemMachineInstallOrder {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 商户名称
     */
    private String mchName;

    /**
     * 商户姓名
     */
    private String linkName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 安装人员
     */
    private String installPeople;

    /**
     * 安装台数
     */
    private Integer installNumber;

    /**
     * 订单编号
     */
    private String installOrderNo;

    /**
     * 是否撤销: 0.否，1.是
     */
    private int isRevoke;

    /**
     * 渠道id
     */
    private Integer channeId;

    /**
     * 所属结算人员
     */
    private Integer settlementId;



}