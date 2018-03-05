package com.bkgc.bean.vem;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LotteryOrder{
    /**
     * 编号
     */
    private String id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 微信支付订单号
     */
    private String wechatOrderNo;

    /**
     * 商户id
     */
    private String mchId;

    /**
     * 服务商户id
     */
    private String serviceMchId;

    /**
     * 订单总额
     */
    private BigDecimal orderTotalAmount;

    /**
     * 福包支付额
     */
    private BigDecimal blessAmount;

    /**
     * 福包折扣额
     */
    private BigDecimal blessDiscount;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 微信支付额
     */
    private BigDecimal wechatAmount;

    /**
     * 收货人
     */
    private String receivePeople;

    /**
     * 联系方式
     */
    private String contactType;

    /**
     * 收货地址
     */
    private String receiveAddress;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付状态
     */
    private String payStatus;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 配送时间
     */
    private Date sendTime;

    /**
     * 完成时间
     */
    private Date finishTime;

    /**
     * 订单明细
     */
    private List<LotteryOrderDetail> detailList;

    private String startDate;

    private String endDate;
      //商户名称
    private String username;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取订单号
     *
     * @return order_no - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取商户id
     *
     * @return mch_id - 商户id
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * 设置商户id
     *
     * @param mchId 商户id
     */
    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    /**
     * 获取服务商户id
     *
     * @return service_mch_id - 服务商户id
     */
    public String getServiceMchId() {
        return serviceMchId;
    }

    /**
     * 设置服务商户id
     *
     * @param serviceMchId 服务商户id
     */
    public void setServiceMchId(String serviceMchId) {
        this.serviceMchId = serviceMchId;
    }

    /**
     * 获取订单总额
     *
     * @return order_total_amount - 订单总额
     */
    public BigDecimal getOrderTotalAmount() {
        return orderTotalAmount;
    }

    /**
     * 设置订单总额
     *
     * @param orderTotalAmount 订单总额
     */
    public void setOrderTotalAmount(BigDecimal orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    /**
     * 获取福包支付额
     *
     * @return bless_amount - 福包支付额
     */
    public BigDecimal getBlessAmount() {
        return blessAmount;
    }

    /**
     * 设置福包支付额
     *
     * @param blessAmount 福包支付额
     */
    public void setBlessAmount(BigDecimal blessAmount) {
        this.blessAmount = blessAmount;
    }

    /**
     * 获取福包折扣额
     *
     * @return bless_discount - 福包折扣额
     */
    public BigDecimal getBlessDiscount() {
        return blessDiscount;
    }

    /**
     * 设置福包折扣额
     *
     * @param blessDiscount 福包折扣额
     */
    public void setBlessDiscount(BigDecimal blessDiscount) {
        this.blessDiscount = blessDiscount;
    }

    /**
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取微信支付额
     *
     * @return wechat_amount - 微信支付额
     */
    public BigDecimal getWechatAmount() {
        return wechatAmount;
    }

    /**
     * 设置微信支付额
     *
     * @param wechatAmount 微信支付额
     */
    public void setWechatAmount(BigDecimal wechatAmount) {
        this.wechatAmount = wechatAmount;
    }

    /**
     * 获取收货人
     *
     * @return receive_people - 收货人
     */
    public String getReceivePeople() {
        return receivePeople;
    }

    /**
     * 设置收货人
     *
     * @param receivePeople 收货人
     */
    public void setReceivePeople(String receivePeople) {
        this.receivePeople = receivePeople;
    }

    /**
     * 获取联系方式
     *
     * @return contact_type - 联系方式
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * 设置联系方式
     *
     * @param contactType 联系方式
     */
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    /**
     * 获取收货地址
     *
     * @return receive_address - 收货地址
     */
    public String getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * 设置收货地址
     *
     * @param receiveAddress 收货地址
     */
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取支付状态
     *
     * @return pay_status - 支付状态
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * 设置支付状态
     *
     * @param payStatus 支付状态
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取配送时间
     *
     * @return send_time - 配送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置配送时间
     *
     * @param sendTime 配送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取完成时间
     *
     * @return finish_time - 完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间
     *
     * @param finishTime 完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public List<LotteryOrderDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<LotteryOrderDetail> detailList) {
        this.detailList = detailList;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWechatOrderNo() {
        return wechatOrderNo;
    }

    public void setWechatOrderNo(String wechatOrderNo) {
        this.wechatOrderNo = wechatOrderNo;
    }

    @Override
    public String toString() {
        return "LotteryOrder{" +
                "id='" + id + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", mchId='" + mchId + '\'' +
                ", serviceMchId='" + serviceMchId + '\'' +
                ", orderTotalAmount=" + orderTotalAmount +
                ", blessAmount=" + blessAmount +
                ", blessDiscount=" + blessDiscount +
                ", discount=" + discount +
                ", wechatAmount=" + wechatAmount +
                ", receivePeople='" + receivePeople + '\'' +
                ", contactType='" + contactType + '\'' +
                ", receiveAddress='" + receiveAddress + '\'' +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", payStatus='" + payStatus + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", sendTime=" + sendTime +
                ", finishTime=" + finishTime +
                '}';
    }
}