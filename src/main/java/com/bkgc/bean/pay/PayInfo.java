package com.bkgc.bean.pay;

import java.math.BigDecimal;
import java.util.Date;

import com.bkgc.bean.PageParam;
import com.fasterxml.jackson.annotation.JsonFormat;

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

    /**
     * <pre>
     * 获取：主键id
     * 表字段：Pay_Info.id
     * </pre>
     *
     * @return Pay_Info.id：主键id
     */
    public String getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键id
     * 表字段：Pay_Info.id
     * </pre>
     *
     * @param id
     *            Pay_Info.id：主键id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * <pre>
     * 获取：支付类型 1福金|2支付宝|3微信
     * 表字段：Pay_Info.pay_type
     * </pre>
     *
     * @return Pay_Info.pay_type：支付类型 1福金|2支付宝|3微信
     */
    public String getPayType() {
        return payType;
    }

    /**
     * <pre>
     * 设置：支付类型 1福金|2支付宝|3微信
     * 表字段：Pay_Info.pay_type
     * </pre>
     *
     * @param payType
     *            Pay_Info.pay_type：支付类型 1福金|2支付宝|3微信
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * <pre>
     * 获取：订单号
     * 表字段：Pay_Info.order_no
     * </pre>
     *
     * @return Pay_Info.order_no：订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * <pre>
     * 设置：订单号
     * 表字段：Pay_Info.order_no
     * </pre>
     *
     * @param orderNo
     *            Pay_Info.order_no：订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * <pre>
     * 获取：预支付单号
     * 表字段：Pay_Info.pre_pay_no
     * </pre>
     *
     * @return Pay_Info.pre_pay_no：预支付单号
     */
    public String getPrePayNo() {
        return prePayNo;
    }

    /**
     * <pre>
     * 设置：预支付单号
     * 表字段：Pay_Info.pre_pay_no
     * </pre>
     *
     * @param prePayNo
     *            Pay_Info.pre_pay_no：预支付单号
     */
    public void setPrePayNo(String prePayNo) {
        this.prePayNo = prePayNo == null ? null : prePayNo.trim();
    }

    /**
     * <pre>
     * 获取：产品名称
     * 表字段：Pay_Info.product_name
     * </pre>
     *
     * @return Pay_Info.product_name：产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * <pre>
     * 设置：产品名称
     * 表字段：Pay_Info.product_name
     * </pre>
     *
     * @param productName
     *            Pay_Info.product_name：产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * <pre>
     * 获取：产品价格
     * 表字段：Pay_Info.product_price
     * </pre>
     *
     * @return Pay_Info.product_price：产品价格
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * <pre>
     * 设置：产品价格
     * 表字段：Pay_Info.product_price
     * </pre>
     *
     * @param productPrice
     *            Pay_Info.product_price：产品价格
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * <pre>
     * 获取：产品数量
     * 表字段：Pay_Info.product_count
     * </pre>
     *
     * @return Pay_Info.product_count：产品数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * <pre>
     * 设置：产品数量
     * 表字段：Pay_Info.product_count
     * </pre>
     *
     * @param productCount
     *            Pay_Info.product_count：产品数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * <pre>
     * 获取：总金额
     * 表字段：Pay_Info.total_fee
     * </pre>
     *
     * @return Pay_Info.total_fee：总金额
     */
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**
     * <pre>
     * 设置：总金额
     * 表字段：Pay_Info.total_fee
     * </pre>
     *
     * @param totalFee
     *            Pay_Info.total_fee：总金额
     */
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * <pre>
     * 获取：摘要
     * 表字段：Pay_Info.subject
     * </pre>
     *
     * @return Pay_Info.subject：摘要
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <pre>
     * 设置：摘要
     * 表字段：Pay_Info.subject
     * </pre>
     *
     * @param subject
     *            Pay_Info.subject：摘要
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * <pre>
     * 获取：详细信息
     * 表字段：Pay_Info.body
     * </pre>
     *
     * @return Pay_Info.body：详细信息
     */
    public String getBody() {
        return body;
    }

    /**
     * <pre>
     * 设置：详细信息
     * 表字段：Pay_Info.body
     * </pre>
     *
     * @param body
     *            Pay_Info.body：详细信息
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    /**
     * <pre>
     * 获取：-1支付失败|0未支付|1支付完成|2支付超时
     * 表字段：Pay_Info.pay_status
     * </pre>
     *
     * @return Pay_Info.pay_status：-1支付失败|0未支付|1支付完成|2支付超时
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * <pre>
     * 设置：-1支付失败|0未支付|1支付完成|2支付超时
     * 表字段：Pay_Info.pay_status
     * </pre>
     *
     * @param payStatus
     *            Pay_Info.pay_status：-1支付失败|0未支付|1支付完成|2支付超时
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    /**
     * <pre>
     * 获取：回调url
     * 表字段：Pay_Info.notify_url
     * </pre>
     *
     * @return Pay_Info.notify_url：回调url
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * <pre>
     * 设置：回调url
     * 表字段：Pay_Info.notify_url
     * </pre>
     *
     * @param notifyUrl
     *            Pay_Info.notify_url：回调url
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }



    /**
     * <pre>
     * 获取：创建时间
     * 表字段：Pay_Info.create_time
     * </pre>
     *
     * @return Pay_Info.create_time：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：Pay_Info.create_time
     * </pre>
     *
     * @param createTime
     *            Pay_Info.create_time：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <pre>
     * 获取：完成支付时间
     * 表字段：Pay_Info.finish_time
     * </pre>
     *
     * @return Pay_Info.finish_time：完成支付时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * <pre>
     * 设置：完成支付时间
     * 表字段：Pay_Info.finish_time
     * </pre>
     *
     * @param finishTime
     *            Pay_Info.finish_time：完成支付时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getBussinessType() {
        return bussinessType;
    }

    public void setBussinessType(String bussinessType) {
        this.bussinessType = bussinessType;
    }

    public String getMoneyWay() {
        return moneyWay;
    }

    public void setMoneyWay(String moneyWay) {
        this.moneyWay = moneyWay;
    }

    public String getInWay() {
        return inWay;
    }

    public void setInWay(String inWay) {
        this.inWay = inWay;
    }

    public String getOutWay() {
        return outWay;
    }

    public void setOutWay(String outWay) {
        this.outWay = outWay;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getBuyUserId() {
        return buyUserId;
    }

    public void setBuyUserId(String buyUserId) {
        this.buyUserId = buyUserId;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public String toString() {
        return "PayInfo{" +
                "id='" + id + '\'' +
                ", payType='" + payType + '\'' +
                ", bussinessType='" + bussinessType + '\'' +
                ", moneyWay='" + moneyWay + '\'' +
                ", inWay='" + inWay + '\'' +
                ", outWay='" + outWay + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", prePayNo='" + prePayNo + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCount=" + productCount +
                ", totalFee=" + totalFee +
                ", originalAmount=" + originalAmount +
                ", discountAmount=" + discountAmount +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", userId='" + userId + '\'' +
                ", buyUserId='" + buyUserId + '\'' +
                ", createTime=" + createTime +
                ", finishTime=" + finishTime +
                ", deviceInfo='" + deviceInfo + '\'' +
                ", machineId='" + machineId + '\'' +
                ", orderSource='" + orderSource + '\'' +
                '}';
    }
}