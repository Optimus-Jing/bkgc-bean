package com.bkgc.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class BlessRequestParams implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;//用户Id
    private String number;//福包数量
    private String isRandom;//是否随机
    private String money;//福包总金额
    private String type;//福包类型
    private String machineId;//自助机编号
    private String receiveExpiredTime;//超时时间
    private String dailyVaild;//福包在每天的有效时间段
    private String remark;//备注
    private String accessToken;//token
    private String groupId;//福包池Id
    private String expired;//有效时间
    private String location;//登录地点
    private String userName;//用户名
    private String password;//密码
    private String openId;//第三方登录的Id
    private String phone;//手机号
    private String nickName;//用户昵称
    private String facePhotoPath;//头像地址
    private String gender;//用户性别
    private String email;//电子邮箱
    private String guid;//用户唯一标识符
    private String imgUrl;//图片地址
    private String payPassword;//支付密码
    private String smsCode;//短信验证码
    private String name;//用户真实姓名
    private String idCardNumber;//用户身份证号码
    private String pageSize;//每页记录数量
    private String pageIndex;//页码
    private String description;//问题描述
    private String imgs;//图片组
    private String machineIds;//自助机组
    private String BVDetailData;//分等级发福包
    private String smgCode;//手机验证码
    private String key;//支付密码
    private String storeId;//商家Id
    private String dateOfType;//日期类型：1：昨天:2：最近一周:3：最近一个月，默认：所有时间
    private String adUserId;//广告主Id
}
