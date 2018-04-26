package com.bkgc.bean.lottery;

import com.bkgc.bean.EntityBase;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class JkpAwardOrder extends EntityBase {

    private static final long serialVersionUID = -3489436224880419225L;

    public class AwardStatus {
        public static final int WaitToCheck = 0;
        public static final int IsChecking = 1;
        public static final int WaitToAward = 2;
        public static final int IsAwarding = 3;
        public static final int WaitToGetMoney = 4;
        public static final int GetAwardOver = 5;

        public static final int AwardIsGot = 10;

        public static final int CannotRecognized = 999;
    }

    ;

    public class AwardType {
        public static final int NoAward = 0;
        public static final int LitteAward = 1;
        public static final int BigAward = 2;
    }

    ;


    public class AwardResultType {
        public static final int Awarded = 1;  //兑奖成功
        public static final int AwardPriceOverOnlineHandlePrice = 2;//兑奖额度超出在线兑奖，提示用户去彩票中心兑奖
        public static final int NotAwarded = 3;//未中奖
    }

    ;


    private String id;

    private String userid;

    private String awardticketid;

    private Timestamp requesttime;

    private String requestlocation;

    private Integer awardstatus;

    private Integer awardlevel;

    private Integer awardmoney;

    private Integer checkmoney;

    private String checkerid;

    private String checkerip;

    private Timestamp checktime;

    private String awarderid;

    private Timestamp awardtime;

    private String awarderip;

    private String validcode;

    private String remark;

    private int islocked;

    private int awardResultType; //兑奖员处理结果类型

    //ticket info
    private String lottosn; //保安区码

    private String barcode; //非保安区码

    private String tickettype; //彩票种类

    private String imgpath; //原始图片位置

    private String correctedImgpath; //处理后的图片位置

    //recognition info
    private String originStr; //彩票识别的原始结果

}

