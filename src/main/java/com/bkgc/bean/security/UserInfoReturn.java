package com.bkgc.bean.security;

/**
 * <p>Title:      UserInfoReturn </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午4:01
 */
public class UserInfoReturn {

    //注册手机号
    private String phone;

    //角色集合
    private String roles;

    //字符串
    private String guid;

    //用户名
    private String username;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserInfoReturn{" +
                "phone='" + phone + '\'' +
                ", roles='" + roles + '\'' +
                ", guid='" + guid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
