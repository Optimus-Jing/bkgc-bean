package com.bkgc.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestParam implements Serializable {

    private static final long serialVersionUID = 9047596813640205643L;
    // base params
    private String pageSize;
    private String pageIndex;
    private String type;
    private String remark;
    private String isRandom;
    private String machineId;

    // auth params
    private String userName;
    private String password;
    private String accessToken;
    private String phone;
    private String smsCode;
    private String nickName;
    private String userId;
    private String name;
    private String openId;
    private String location;
    private String way;
    private String phoneModel;
    private String manufacturer;
    private String phoneUuid;
    private String platform;
    private String token;
    private String gender;
    private String email;
    private String facePhotoPath;
    private String appId;
    private String appSecret;
    private String province;
    private String city;
    private String address;
    private String houseNumber;
    private String postCode;
    private String isDefault;
    private String id;
    private String loginType;
    private String idCardNumber;
    private String payPassword;
    private String sex;

    // Amount params
    private String amount;
    private String outWay;
    private String amountType;
    private String rechargeSn;
    private String withdrawType;
    private String targetAccount;
    private String withdrawAmount;

    // bless
    private String number;
    private String money;
    private String receiveExpiredTime;
    private String groupId;
    private String payStatus;
    private String traceNo;
    private String payWay;
    private String userIds;
    private String barcodeInfo;
    private String beId;
    private String sendType;
    private String beIds;
    private String projetId;

    // friend params
    private String friendUserId;

    // lottory params
    private String lottoNo;
    private String searchKey;
    private String detail;
    private String postAddressId;
    private String orderId;
    private String payTraceNo;
    private String ticketImg;
    private String securityCode;
    private String serialCode;
    private String ticketNumber;
    private String awardCode;

    // project
    private String detailInfo;

    // push
    private String to;
    private String from;
    private String title;
    private String msgContent;
    private String msgType;
    private String data;
    private String alert;

    // PayCenter
    private String partnerId;
    private String tradeNo;
    private String outTradeNo;
    private String totalFee;
    private String body;
    private String notifyUrl;
    private String returnUrl;
    private String showUrl;
    private String subject;
    private String strTradeCode;
    private String payOrderId;
    private String fee;
    private String content;
    private String totalAmount;
    private String notifyTime;
    private String notifyType;
    private String notifyId;
    private String charSet;
    private String version;
    private String channel;
    private String signType;
    private String sign;
    private String outBizNo;
    private String buyerId;
    private String buyerLogonId;
    private String sellerId;
    private String sellerEmail;
    private String tradeStatus;
    private String receiptAmount;
    private String invoiceAmount;
    private String buyerPayAmount;
    private String Operator;
    // FeedBack
    private String description;
    private String imgs;

    private String withdrawId;

    private String awardOrderId;

    private String dailyVaild;

    private String expired;

    private Integer payType;

    /**
     * 支付密码
     */
    private String key;

}
