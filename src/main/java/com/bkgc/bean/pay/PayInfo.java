package com.bkgc.bean.pay;

import com.bkgc.bean.PageParam;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PayInfo extends PageParam {
    /**
     * <pre>
     * 主键id
     * 表字段 : Pay_Info.id
     * </pre>
     */
    private String id;

    /**
     * <pre>
     * 支付类型 1福金|2支付宝|3微信
     * 表字段 : Pay_Info.pay_type
     * </pre>
     */
    private String payType;


    /**
     * 业务类型 0支付 1退款
     */
    private String bussinessType;

    /**
     * 转入转出 0转入|1转出
     */
    private String moneyWay;

    /**
     * 转入原因
     */
    private String inWay;

    /**
     * 转出原因
     */
    private String outWay;

    /**
     * <pre>
     * 订单号
     * 表字段 : Pay_Info.order_no
     * </pre>
     */
    private String orderNo;

    /**
     * <pre>
     * 预支付单号
     * 表字段 : Pay_Info.pre_pay_no
     * </pre>
     */
    private String prePayNo;

    /**
     * 交易成功单号
     */
    private String transactionId;

    /**
     * <pre>
     * 产品名称
     * 表字段 : Pay_Info.product_name
     * </pre>
     */
    private String productName;

    /**
     * <pre>
     * 产品价格
     * 表字段 : Pay_Info.product_price
     * </pre>
     */
    private BigDecimal productPrice;

    /**
     * <pre>
     * 产品数量
     * 表字段 : Pay_Info.product_count
     * </pre>
     */
    private Integer productCount;

    /**
     * <pre>
     * 总金额
     * 表字段 : Pay_Info.total_fee
     * </pre>
     */
    private BigDecimal totalFee;

    /**
     * 原始金额
     */
    private BigDecimal originalAmount;

    /**
     * 折扣金额
     */
    private BigDecimal discountAmount;


    /**
     * <pre>
     * 摘要
     * 表字段 : Pay_Info.subject
     * </pre>
     */
    private String subject;

    /**
     * <pre>
     * 详细信息
     * 表字段 : Pay_Info.body
     * </pre>
     */
    private String body;

    /**
     * <pre>
     * -1支付失败|0未支付|1支付完成|2支付超时
     * 表字段 : Pay_Info.pay_status
     * </pre>
     */
    private String payStatus;

    /**
     * <pre>
     * 回调url
     * 表字段 : Pay_Info.notify_url
     * </pre>
     */
    private String notifyUrl;

    /**
     * <pre>
     * 创建人id
     * 表字段 : Pay_Info.UserId
     * </pre>
     */
    private String userId;

    /**
     * 买家用户id
     */
    private String buyUserId;

    /**
     * <pre>
     * 创建时间
     * 表字段 : Pay_Info.create_time
     * </pre>
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * <pre>
     * 完成支付时间
     * 表字段 : Pay_Info.finish_time
     * </pre>
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date finishTime;

    /**
     * 设备信息
     */
    private String deviceInfo;

    /**
     * 自助机编码
     */
    private String machineId;

    /**
     * 订单来源
     */
    private String orderSource;
}