package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class LottoJkpAwardOrder extends PageParam {

    private static final long serialVersionUID = -7979149037529632780L;

    private String id;

    private String userid;

    private String phone;

    private String awardticketid;

    private Date requesttime;

    private String requestlocation;

    private Integer awardstatus;

    private Integer awardlevel;

    private Integer awardmoney;

    private Integer checkmoney;

    private String checkerid;

    private String checkerip;

    private Date checktime;

    private String awarderid;

    private Date awardtime;

    private String awarderip;

    private Integer islocked;

    private Date lockExpired;

    private String validcode;

    private String remark;

    private String lottosn;

    private String imgpath;

    private String tickettype;

    private String barcode;

    private String correctedimgpath;

    private String originstr;

    private String ticketNumber;

    private String awardCode;

    private Integer pageSize; //每一页大小
    private Integer pageStart;//开始页数

    private String tenMinsBefore;

    private String scannerResultImagePath; //识别扫码枪兑奖结果图片存储相对路径

    private int awardRecognitionResult;//扫码枪识别结果 

    private String awardRecognitionTime;//扫码识别时间

    private Integer process;//处理进程

    private Integer awardResultType; //兑奖结果类型

    private String appVersion;//兑奖使用app版本
}