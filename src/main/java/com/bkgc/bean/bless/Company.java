package com.bkgc.bean.bless;
import java.sql.Timestamp;


public class Company 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7629746774139114933L;
	
    private String id;
    /**
    * 编号
    */
	public String getId() {
	    return this.id;
    }
    /**
    * 编号
    */
	public void setId(String id) {
		this.id = id;
	}	
	private String name;
    /**
    * 名称
    */
	public String getName() {
	    return this.name;
    }
    /**
    * 名称
    */
	public void setName(String name) {
		this.name = name;
	}
    
    private String phone;
    /**
    * 电话
    */
	public String getPhone() {
	    return this.phone;
    }
    /**
    * 电话
    */
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    private String fax;
    /**
    * 传真
    */
	public String getFax() {
	    return this.fax;
    }
    /**
    * 传真
    */
	public void setFax(String fax) {
		this.fax = fax;
	}
    
    private String email;
    /**
    * 邮箱
    */
	public String getEmail() {
	    return this.email;
    }
    /**
    * 邮箱
    */
	public void setEmail(String email) {
		this.email = email;
	}
    
    private String address;
    /**
    * 联系地址
    */
	public String getAddress() {
	    return this.address;
    }
    /**
    * 联系地址
    */
	public void setAddress(String address) {
		this.address = address;
	}
    
    private String postCode;
    /**
    * 邮编
    */
	public String getPostCode() {
	    return this.postCode;
    }
    /**
    * 邮编
    */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
    
    private String contactPerson;
    /**
    * 联系人
    */
	public String getContactPerson() {
	    return this.contactPerson;
    }
    /**
    * 联系人
    */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
    
    private String contactPersonPhone;
    /**
    * 联系人电话
    */
	public String getContactPersonPhone() {
	    return this.contactPersonPhone;
    }
    /**
    * 联系人电话
    */
	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}
    
    private String loginId;
    /**
    * 登录账户编号
    */
	public String getLoginId() {
	    return this.loginId;
    }
    /**
    * 登录账户编号
    */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
    
    private Timestamp createTime;
    /**
    * 创建时间
    */
	public Timestamp getCreateTime() {
	    return this.createTime;
    }
    /**
    * 创建时间
    */
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
    
	private String logoPath;
    /**
    * 企业logo
    */
	public String getLogoPath() {
	    return this.logoPath;
    }
    /**
    * 企业logo
    */
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	
	public Integer channelId;
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	
	private String guid;
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
}

