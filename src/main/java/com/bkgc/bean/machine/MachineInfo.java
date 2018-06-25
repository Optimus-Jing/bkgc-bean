package com.bkgc.bean.machine;

import com.bkgc.bean.PageParam;
import com.bkgc.bean.channel.Channel;
import com.bkgc.bean.user.User;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MachineInfo extends PageParam implements Serializable {

    private static final long serialVersionUID = -2813703001859742981L;

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

    private Integer payTimeout;

    private Integer tradeTimeout;

    private Integer cleanLogTime;

    private Integer cleanTradeTime;

    private Integer rebootDelayTime;

    private Integer isWechat;

    private Integer isAlipay;

    private Integer isFujin;

    private String logoUrl;

    private String ledText;

    private Integer storeId;

    private String storeName;

    private String signInTime;

    private String signOutTime;

    private Integer sceneId;

    private Integer channelId;

    private String sceneName;

    private String keyId;

    private Integer status;

    private String ui;

    private User user;

    private String channelName;

    private Channel channel;

    private Integer searchChannelId;

    private String settlementUserId;

    private String imei;

    /**
     * 铭牌号
     */
    private String nameplate;

}