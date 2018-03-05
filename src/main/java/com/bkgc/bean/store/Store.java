package com.bkgc.bean.store;

import java.util.Date;

import com.bkgc.bean.PageParam;

public class Store  extends PageParam {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6077197106715476502L;

	private int id;

    private String name;

    private String phone;

    private String fixPhone;

    private String fax;

    private String mail;

    private String address;

    private String postcode;

    private String contact;

    private String contactPhone;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private Integer channelId;

    private Integer status;

    private String longitude;

    private String latitude;

    private String imgUrl;

    private String description;
    
    private Date createTimeStart;
    
    private Date createTimeEnd;
    
    private String channelName;
    
    private Integer regionCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFixPhone() {
        return fixPhone;
    }

    public void setFixPhone(String fixPhone) {
        this.fixPhone = fixPhone == null ? null : fixPhone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	public Date getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeStart(Date createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(Integer regionCode) {
		this.regionCode = regionCode;
	}
	
	public void check(){
		/*this.address=StringUtils.isEmpty(this.address)?null:this.address;
		this.channelId=StringUtils.isEmpty(this.channelId)?null:this.channelId;
		this.channelName=StringUtils.isEmpty(this.channelName)?null:this.channelName;
		this.contact=StringUtils.isEmpty(this.contact)?null:this.contact;
		this.contactPhone=StringUtils.isEmpty(this.contactPhone)?null:this.contactPhone;
		this.createTime=StringUtils.isEmpty(this.createTime)?null:this.createTime;
		this.createTimeEnd=StringUtils.isEmpty(this.createTimeEnd)?null:this.createTimeEnd;
		this.createTimeStart=StringUtils.isEmpty(this.createTimeStart)?null:this.createTimeStart;
		this.description=StringUtils.isEmpty(this.description)?null:this.description;
		this.fax=StringUtils.isEmpty(this.fax)?null:this.fax;
		this.fixPhone=StringUtils.isEmpty(this.fixPhone)?null:this.fixPhone;
		this.imgUrl=StringUtils.isEmpty(this.imgUrl)?null:this.imgUrl;
		this.isDelete=StringUtils.isEmpty(this.isDelete)?null:this.isDelete;
		this.latitude=StringUtils.isEmpty(this.latitude)?null:this.latitude;
		this.longitude=StringUtils.isEmpty(this.longitude)?null:this.longitude;
		this.mail=StringUtils.isEmpty(this.mail)?null:this.mail;
		this.name=StringUtils.isEmpty(this.name)?null:this.name;
		this.phone=StringUtils.isEmpty(this.phone)?null:this.phone;
		this.postcode=StringUtils.isEmpty(this.postcode)?null:this.postcode;
		this.regionCode=StringUtils.isEmpty(this.regionCode)?null:this.regionCode;
		this.status=StringUtils.isEmpty(this.status)?null:this.status;
		this.updateTime=StringUtils.isEmpty(this.updateTime)?null:this.updateTime;
		this.id=StringUtils.isEmpty(this.channelId)?null:this.channelId;
		
		
		*/
	}
}