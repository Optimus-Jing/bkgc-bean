package com.bkgc.bean.security;

import lombok.Data;

/**
 * <p>Title:      UserRegReturn </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午2:56
 */
public class UserRegReturn {

    //角色id
    private String roleId;

    //角色名称
    private String rolename;


    //平台
    private String platform;

    //用户名
    private String username;

    //唯一标识符
    private String guid;

    //手机号
    private String phone;

    //电子邮箱
    private String email;

    public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }


    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	@Override
	public String toString() {
		return "UserRegReturn [roleId=" + roleId + ", rolename=" + rolename + ", platform=" + platform + ", username="
				+ username + ", guid=" + guid + ", phone=" + phone + ", email=" + email + "]";
	}

}
