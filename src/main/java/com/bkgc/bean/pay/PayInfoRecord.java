package com.bkgc.bean.pay;

import java.math.BigDecimal;
import java.util.Date;

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

    /**
     * <pre>
     * 获取：主键id
     * 表字段：Pay_Info_Record.id
     * </pre>
     *
     * @return Pay_Info_Record.id：主键id
     */
    public String getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键id
     * 表字段：Pay_Info_Record.id
     * </pre>
     *
     * @param id
     *            Pay_Info_Record.id：主键id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * <pre>
     * 获取：支付id
     * 表字段：Pay_Info_Record.pay_id
     * </pre>
     *
     * @return Pay_Info_Record.pay_id：支付id
     */
    public String getPayId() {
        return payId;
    }

    /**
     * <pre>
     * 设置：支付id
     * 表字段：Pay_Info_Record.pay_id
     * </pre>
     *
     * @param payId
     *            Pay_Info_Record.pay_id：支付id
     */
    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    /**
     * <pre>
     * 获取：支付状态
     * 表字段：Pay_Info_Record.pay_status
     * </pre>
     *
     * @return Pay_Info_Record.pay_status：支付状态
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * <pre>
     * 设置：支付状态
     * 表字段：Pay_Info_Record.pay_status
     * </pre>
     *
     * @param payStatus
     *            Pay_Info_Record.pay_status：支付状态
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    /**
     * <pre>
     * 获取：备注
     * 表字段：Pay_Info_Record.remark
     * </pre>
     *
     * @return Pay_Info_Record.remark：备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * <pre>
     * 设置：备注
     * 表字段：Pay_Info_Record.remark
     * </pre>
     *
     * @param remark
     *            Pay_Info_Record.remark：备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * <pre>
     * 获取：创建人id
     * 表字段：Pay_Info_Record.UserId
     * </pre>
     *
     * @return Pay_Info_Record.UserId：创建人id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * <pre>
     * 设置：创建人id
     * 表字段：Pay_Info_Record.UserId
     * </pre>
     *
     * @param userid
     *            Pay_Info_Record.UserId：创建人id
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：Pay_Info_Record.create_time
     * </pre>
     *
     * @return Pay_Info_Record.create_time：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：Pay_Info_Record.create_time
     * </pre>
     *
     * @param createTime
     *            Pay_Info_Record.create_time：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}