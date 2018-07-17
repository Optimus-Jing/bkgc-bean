package com.bkgc.bean.award;

import lombok.Data;

import java.util.Date;

@Data
public class LottoAutoawardOrder {
    /**
     * 编号
     */
    private String id;

    /**
     * 兑奖订单号
     */
    private String orderno;

    /**
     * 兑奖用户Id
     */
    private String userid;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 兑奖请求时间
     */
    private Date requesttime;

    private int requesttype;

    /**
     * 是否正在被处理（0：否；1：是）
     */
    private Integer islocked;

    /**
     * 锁失效时间
     */
    private Date lockexpired;

    /**
     * 校验码(时间、金额、会员类型、会员编号加密字符串)，用于防止人为篡改数据
     */
    private String validcode;

    /**
     * 保安区二维码
     */
    private String safeqr;

    /**
     * 物流二维码
     */
    private String transportqr;

    /**
     * 票号
     */
    private String ticketno;

    /**
     * 手动兑奖输入的兑奖码
     */
    private String awardno;

    /**
     * 彩票类别1单码票；2双码票
     */
    private Integer tickettype;

    /**
     * 操作员（兑奖员）Id
     */
    private String awarderid;

    /**
     * 兑奖奖项处理时间
     */
    private Date awardtime;

    /**
     * 兑奖操作员IP
     */
    private String awarderip;

    /**
     * 奖项（1-12）
     */
    private Integer awardlevel;

    /**
     * 1:自动兑奖;2人工兑奖
     */
    private Integer awardflag;

    /**
     * 兑奖状态（0未兑奖|1兑奖成功|2兑奖失败）
     */
    private Integer awardstatus;

    /**
     * 1.中奖（奖金额度小于10000）2.中奖（奖金额度大于10000）3.彩票未中奖 4.票号和兑奖码不匹配,无法兑奖 5.该票已兑过奖，请勿重复兑奖 6.票号或兑奖码输入不正确，不能兑奖
     */
    private Integer awardresulttype;

    /**
     * 奖金
     */
    private Integer awardmoney;

    /**
     * 兼容1.0版本ios所建的
     */
    private String appversion;

    /**
     * 省份编码
     */
    private Integer provinceid;

    private String awarddeviceid;

    /**
     * 门店编号
     */
    private String customerno;

    /**
     * 设备编码
     */
    private String terminalno;

    /**
     * 供应商编码
     */
    private String providerno;

    /**
     * 游戏编码
     */
    private String gameno;

    /**
     * 包号
     */
    private String packageno;

    /**
     * 票序号
     */
    private String ticketserialno;


    /**
     * 游戏名称
     */
    private String instantgamename;

    /**
     * 彩种编码
     */
    private String instantgameno;

    /**
     * 奖项等级
     */
    private String instantprizelevel;


    /**
     * 体彩接口返回数据
     */
    private String autoawardremark;

    /**
     * 备注
     */
    private String remark;

    /**
     * 自动兑奖状态
     */
    private Integer autoawardstatus;

    /**
     * 系统处理异常编码
     */
    private Integer exceptioncode;

    /**
     * 系统处理异常描述
     */
    private String exceptiondesc;

    private String tenMinsBefore;

    private String awardstatusname;

    private String requesttypename;
    /**
     * 订单是否使用过翻倍卡  1：使用过
     */
    private String useCard;
    /**
     * 标识是不是自助机销售的彩票 1：是自助机销售 0：不是自助机销售
     */
    private String sell;
}