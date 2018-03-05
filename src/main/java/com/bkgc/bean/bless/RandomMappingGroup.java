package com.bkgc.bean.bless;


import java.util.Date;

public class RandomMappingGroup {

	private String id;
	
	//生成的七位随机数
	private String randomNumber;
	
	//随机数映射的福包组Id
	private String groupId;

	//福包组类型
	private Integer groupType;

	//映射地址
	private String groupURL;

	private Date createTime;

	public String getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(String randomNumber) {
		this.randomNumber = randomNumber;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupURL() {
		return groupURL;
	}

	public void setGroupURL(String groupURL) {
		this.groupURL = groupURL;
	}

	public Integer getGroupType() {
		return groupType;
	}

	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "RandomMappingGroup{" +
				"id='" + id + '\'' +
				", randomNumber='" + randomNumber + '\'' +
				", groupId='" + groupId + '\'' +
				", groupType=" + groupType +
				", groupURL='" + groupURL + '\'' +
				", createTime=" + createTime +
				'}';
	}
}
