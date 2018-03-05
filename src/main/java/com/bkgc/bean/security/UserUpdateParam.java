package com.bkgc.bean.security;

/**
 * <p>Title:      UserUpdateParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午4:14
 */
public class UserUpdateParam {

    //token
    private String access_token;

    //用户名
    private String username;

    //密码
    private String password;

    //手机号
    private String phone;

    //电子邮箱
    private String email;

    //唯一字符串
    private String guid;

    //头像路径
    private String img_url;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    @Override
    public String toString() {
        return "UserUpdateParam{" +
                "access_token='" + access_token + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", guid='" + guid + '\'' +
                ", img_url='" + img_url + '\'' +
                '}';
    }
}
