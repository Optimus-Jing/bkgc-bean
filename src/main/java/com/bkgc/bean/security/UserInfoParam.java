package com.bkgc.bean.security;


/**
 * <p>Title:      UserInfoParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午4:00
 */
public class UserInfoParam {

    //唯一标识符
    private String guid;

    //token
    private String access_token;
    
    //手机号
    private String phone;

    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

	@Override
	public String toString() {
		return "UserInfoParam [guid=" + guid + ", access_token=" + access_token + ", phone=" + phone + "]";
	}

}
