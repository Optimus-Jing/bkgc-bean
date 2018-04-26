package com.bkgc.bean.pay;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PayInfoRecord {
    /**
     * <pre>
     * 主键id
     * 表字段 : Pay_Info_Record.id
     * </pre>
     */
    private String id;

    /**
     * <pre>
     * 支付id
     * 表字段 : Pay_Info_Record.pay_id
     * </pre>
     */
    private String payId;

    /**
     * <pre>
     * 支付状态
     * 表字段 : Pay_Info_Record.pay_status
     * </pre>
     */
    private String payStatus;

    /**
     * <pre>
     * 备注
     * 表字段 : Pay_Info_Record.remark
     * </pre>
     */
    private String remark;

    /**
     * <pre>
     * 创建人id
     * 表字段 : Pay_Info_Record.UserId
     * </pre>
     */
    private String userid;

    /**
     * <pre>
     * 创建时间
     * 表字段 : Pay_Info_Record.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * 支付金额
     */
    private BigDecimal amount;

}