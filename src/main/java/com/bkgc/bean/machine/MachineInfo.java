package com.bkgc.bean.machine;

import com.bkgc.bean.PageParam;
import com.bkgc.bean.channel.Channel;
import com.bkgc.bean.user.User;

import java.io.Serializable;
import java.util.Date;

public class MachineInfo extends PageParam implements Serializable{
    /**
	 * 
	 */
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


    private User user;
    
    private String channelName;

    private Channel channel;

    private Integer searchChannelId;

    
    public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getAisleCount() {
        return aisleCount;
    }

    public void setAisleCount(Integer aisleCount) {
        this.aisleCount = aisleCount;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(Integer warningCount) {
        this.warningCount = warningCount;
    }

    public Integer getVoice() {
        return voice;
    }

    public void setVoice(Integer voice) {
        this.voice = voice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public String getRamRate() {
        return ramRate;
    }

    public void setRamRate(String ramRate) {
        this.ramRate = ramRate == null ? null : ramRate.trim();
    }

    public String getApkVersion() {
        return apkVersion;
    }

    public void setApkVersion(String apkVersion) {
        this.apkVersion = apkVersion == null ? null : apkVersion.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getApkStatus() {
        return apkStatus;
    }

    public void setApkStatus(Integer apkStatus) {
        this.apkStatus = apkStatus;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getScreenUrl() {
        return screenUrl;
    }

    public void setScreenUrl(String screenUrl) {
        this.screenUrl = screenUrl == null ? null : screenUrl.trim();
    }

    public String getWechatAppid() {
        return wechatAppid;
    }

    public void setWechatAppid(String wechatAppid) {
        this.wechatAppid = wechatAppid == null ? null : wechatAppid.trim();
    }

    public String getScrollText() {
        return scrollText;
    }

    public void setScrollText(String scrollText) {
        this.scrollText = scrollText == null ? null : scrollText.trim();
    }

    public String getRebootTime() {
        return rebootTime;
    }

    public void setRebootTime(String rebootTime) {
        this.rebootTime = rebootTime == null ? null : rebootTime.trim();
    }

    public String getOffTime() {
        return offTime;
    }

    public void setOffTime(String offTime) {
        this.offTime = offTime == null ? null : offTime.trim();
    }

    public String getOnTime() {
        return onTime;
    }

    public void setOnTime(String onTime) {
        this.onTime = onTime == null ? null : onTime.trim();
    }

    public Integer getPayTimeout() {
        return payTimeout;
    }

    public void setPayTimeout(Integer payTimeout) {
        this.payTimeout = payTimeout;
    }

    public Integer getTradeTimeout() {
        return tradeTimeout;
    }

    public void setTradeTimeout(Integer tradeTimeout) {
        this.tradeTimeout = tradeTimeout;
    }

    public Integer getCleanLogTime() {
        return cleanLogTime;
    }

    public void setCleanLogTime(Integer cleanLogTime) {
        this.cleanLogTime = cleanLogTime;
    }

    public Integer getCleanTradeTime() {
        return cleanTradeTime;
    }

    public void setCleanTradeTime(Integer cleanTradeTime) {
        this.cleanTradeTime = cleanTradeTime;
    }

    public Integer getRebootDelayTime() {
        return rebootDelayTime;
    }

    public void setRebootDelayTime(Integer rebootDelayTime) {
        this.rebootDelayTime = rebootDelayTime;
    }

    public Integer getIsWechat() {
        return isWechat;
    }

    public void setIsWechat(Integer isWechat) {
        this.isWechat = isWechat;
    }

    public Integer getIsAlipay() {
        return isAlipay;
    }

    public void setIsAlipay(Integer isAlipay) {
        this.isAlipay = isAlipay;
    }

    public Integer getIsFujin() {
        return isFujin;
    }

    public void setIsFujin(Integer isFujin) {
        this.isFujin = isFujin;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getLedText() {
        return ledText;
    }

    public void setLedText(String ledText) {
        this.ledText = ledText == null ? null : ledText.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(String signInTime) {
        this.signInTime = signInTime == null ? null : signInTime.trim();
    }

    public String getSignOutTime() {
        return signOutTime;
    }

    public void setSignOutTime(String signOutTime) {
        this.signOutTime = signOutTime == null ? null : signOutTime.trim();
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName == null ? null : sceneName.trim();
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId == null ? null : keyId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    @Override
    public Integer getSearchChannelId() {
        return searchChannelId;
    }

    @Override
    public void setSearchChannelId(Integer searchChannelId) {
        this.searchChannelId = searchChannelId;
    }
}