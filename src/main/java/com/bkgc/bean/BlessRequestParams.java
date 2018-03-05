package com.bkgc.bean;

import java.io.Serializable;

public class BlessRequestParams implements Serializable {

	/**
	 * 
	 */
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
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdUserId() {
		return adUserId;
	}
	public void setAdUserId(String adUserId) {
		this.adUserId = adUserId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getDateOfType() {
		return dateOfType;
	}
	public void setDateOfType(String dateOfType) {
		this.dateOfType = dateOfType;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getSmgCode() {
		return smgCode;
	}
	public void setSmgCode(String smgCode) {
		this.smgCode = smgCode;
	}
	public String getBVDetailData() {
		return BVDetailData;
	}
	public void setBVDetailData(String bVDetailData) {
		BVDetailData = bVDetailData;
	}
	public String getMachineIds() {
		return machineIds;
	}
	public void setMachineIds(String machineIds) {
		this.machineIds = machineIds;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getFacePhotoPath() {
		return facePhotoPath;
	}
	public void setFacePhotoPath(String facePhotoPath) {
		this.facePhotoPath = facePhotoPath;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getPayPassword() {
		return payPassword;
	}
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	public String getSmsCode() {
		return smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCardNumber() {
		return idCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExpired() {
		return expired;
	}
	public void setExpired(String expired) {
		this.expired = expired;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIsRandom() {
		return isRandom;
	}
	public void setIsRandom(String isRandom) {
		this.isRandom = isRandom;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMachineId() {
		return machineId;
	}
	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}
	public String getReceiveExpiredTime() {
		return receiveExpiredTime;
	}
	public void setReceiveExpiredTime(String receiveExpiredTime) {
		this.receiveExpiredTime = receiveExpiredTime;
	}
	public String getDailyVaild() {
		return dailyVaild;
	}
	public void setDailyVaild(String dailyVaild) {
		this.dailyVaild = dailyVaild;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
}
