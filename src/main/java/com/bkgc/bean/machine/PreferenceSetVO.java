package com.bkgc.bean.machine;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class PreferenceSetVO extends PageParam {
    private static final long serialVersionUID = 6892444988734369499L;

    private Integer payTimeout;

    private Integer tradeTimeout;

    private Integer cleanLogTime;

    private Integer cleanTradeTime;

    private Integer isWechat;

    private Integer isAlipay;

    private Integer isFujin;

    private String logoUrl;

    private String ledText;

    private String updateIds;

    private Integer id;

    private String name;

    private String type;

    private String address;

    private String macAddress;

    private String phone;

    private String longitude;

    private String latitude;

    private Date createTime;

    private Date updateTime;

    private Integer aisleCount;

    private Integer layer;

    private Integer warningCount;

    private Integer voice;

    private String description;

    private Integer runStatus;

    private Integer diskSpace;

    private String ramRate;

    private String apkVersion;

    private Integer userId;

    private Integer apkStatus;

    private String ip;

    private String port;

    private String screenUrl;

    private String wechatAppid;

    private String scrollText;

    private String rebootTime;

    private String offTime;

    private String onTime;

    private Integer storeId;

    private String storeName;

    private String signInTime;

    private String signOutTime;

    private Integer sceneId;

    private String sceneName;

    private String keyId;

    private Integer status;

    private Integer isDelete;
    private ArrayList<Integer> idList = new ArrayList<Integer>();

}
