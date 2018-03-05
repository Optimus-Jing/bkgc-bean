package com.bkgc.bean.security;

/**
 * <p>Title:      UserTokenParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午3:53
 */
public class UserTokenParam {

    //用户名(必填)
    private String username;

    //密码(必填)
    private String password;

    //模块(必填)
    private String module;

    //应用id(必填)
    private String client_id;

    //应用秘钥(必填)
    private String client_secret;

    //模式(必填)
    private String grant_type;

    //权限范围(必填)
    private String scope;

    //登录方式
    private String login_type;

    public String getLogin_type() {
        return login_type;
    }

    public void setLogin_type(String login_type) {
        this.login_type = login_type;
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

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "UserTokenParam{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", module='" + module + '\'' +
                ", client_id='" + client_id + '\'' +
                ", client_secret='" + client_secret + '\'' +
                ", grant_type='" + grant_type + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}
