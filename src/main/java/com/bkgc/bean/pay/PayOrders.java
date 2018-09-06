package com.bkgc.bean.pay;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PayOrders extends PageParam {
    private static final long serialVersionUID = 5881124321360470068L;

    private String ids;

    private String payorderid;

    private String a002Ids;

    private String deviceinfo;

    private Integer machineId;

    private String outTradeNo;

    private Date createtime;

    private String body;

    private String notifyUrl;

    private String returnUrl;

    private String sellerEmail;

    private String showUrl;

    private String subject;

    private BigDecimal fee;

    private BigDecimal orderAmount;

    private Integer orderstatus;

    private Date finishtime;

    private String userid;

    private String fromaccount;

    private String companyname;

}