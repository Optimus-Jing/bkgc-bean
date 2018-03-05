package com.bkgc.bean.user;

import java.io.Serializable;
import java.util.Date;

import com.bkgc.bean.PageParam;


public class AuthMember extends PageParam implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2581096918129183996L;

	private String id;

    private String name;

    private String nickname;

    private String gender;

    private String phone;

    private String email;

    private String idcardnumber;

    private String weixinopenid;

    private String qqopenid;

    private String address;

    private String postcode;

    private String loginid;

    private Integer iscertification;

    private Date createtime;

    private String facephotopath;

    private String personimageurl;
    
    private String guid;

    private String createtimeStr;

    private String unionId;

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getCreatetimeStr() {
        return createtimeStr;
    }

    public void setCreatetimeStr(String createtimeStr) {
        this.createtimeStr = createtimeStr;
    }

    public AuthMember() {
    	super();
	}
    
    public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}



	public AuthMember(String id, String nickname) {
    	this();
    	this.id=id;
    	this.nickname=nickname;
	}

	public AuthMember(String id,String nickname,String phone,Integer iscertification,Date createTime,String loginid) {
		this.id = id;
		this.nickname= nickname;
		this.phone = phone;
		this.iscertification = iscertification;
		this.createtime= createTime;
		this.loginid=loginid;
	}
	public AuthMember(String id,String nickname,String phone,Integer iscertification,Date createTime) {
		this.id = id;
		this.nickname= nickname;
		this.phone = phone;
		this.iscertification = iscertification;
		this.createtime= createTime;

	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdcardnumber() {
        return idcardnumber;
    }

    public void setIdcardnumber(String idcardnumber) {
        this.idcardnumber = idcardnumber == null ? null : idcardnumber.trim();
    }

    public String getWeixinopenid() {
        return weixinopenid;
    }

    public void setWeixinopenid(String weixinopenid) {
        this.weixinopenid = weixinopenid == null ? null : weixinopenid.trim();
    }

    public String getQqopenid() {
        return qqopenid;
    }

    public void setQqopenid(String qqopenid) {
        this.qqopenid = qqopenid == null ? null : qqopenid.trim();
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

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public Integer getIscertification() {
        return iscertification;
    }

    public void setIscertification(Integer iscertification) {
        this.iscertification = iscertification;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getFacephotopath() {
        return facephotopath;
    }

    public void setFacephotopath(String facephotopath) {
        this.facephotopath = facephotopath == null ? null : facephotopath.trim();
    }

    public String getPersonimageurl() {
        return personimageurl;
    }

    public void setPersonimageurl(String personimageurl) {
        this.personimageurl = personimageurl == null ? null : personimageurl.trim();
    }
}