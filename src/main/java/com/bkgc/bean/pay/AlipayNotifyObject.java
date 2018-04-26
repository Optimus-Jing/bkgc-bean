package com.bkgc.bean.pay;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 支付宝异步通知参数，详细请参考：https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.e7JIfD&treeId=204&articleId=105301&docType=1#s6
 */
@Data
public class AlipayNotifyObject implements Serializable {

    private static final long serialVersionUID = -2411480145147840997L;

    private Date notify_time;
    private String notify_type;
    private String notify_id;
    private String app_id;
    private String charset;
    private String version;
    private String sign_type;
    private String sign;
    private String trade_no;
    private String out_trade_no;
    private String out_biz_no;
    private String buyer_id;
    private String buyer_logon_id;
    private String seller_id;
    private String seller_email;
    private String trade_status;
    private Number total_amount;
    private Number receipt_amount;
    private Number invoice_amount;
    private Number buyer_pay_amount;
    private Number point_amount;
    private Number refund_fee;
    private String subject;
    private String body;
    private Date gmt_create;
    private Date gmt_payment;
    private Date gmt_refund;
    private Date gmt_close;
    private String fund_bill_list;
    private String passback_params;
    private String voucher_detail_list;

}
