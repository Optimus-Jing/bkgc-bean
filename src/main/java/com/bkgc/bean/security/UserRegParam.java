package com.bkgc.bean.security;


/**
 * <p>Title:      UserRegParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午2:52
 */
public class UserRegParam{

    //平台(必填)
    private String platform;

    //手机号(必填)
    private String phone;

    //密码(必填)
    private String password;

    //角色id(必填)
    private String roleid;

    //用户名称
    private String username;

    //电子邮箱
    private String email;

    //第三方的openId
    private String openid;

    //第三方昵称
    private String nickname;

    //iconurl
    private String iconUrl;

    //第三方备用信息
    private String backup;
    
    //手机验证码
    private String code;


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

	@Override
	public String toString() {
		return "UserRegParam [platform=" + platform + ", phone=" + phone + ", password=" + password + ", roleid="
				+ roleid + ", username=" + username + ", email=" + email + ", openid=" + openid + ", nickname="
				+ nickname + ", iconUrl=" + iconUrl + ", backup=" + backup + ", code=" + code + "]";
	}
   
}
