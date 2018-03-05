package com.bkgc.bean.security;

/**
 * <p>Title:      UserAccessTokenParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午4:03
 */
public class UserAccessTokenParam {

    //应用id
    private String client_id;

    //应用秘钥
    private String client_secret;

    //grant_type
    private String grant_type;

    //刷新token
    private String refresh_token;

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

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    @Override
    public String toString() {
        return "UserAccessTokenParam{" +
                "client_id='" + client_id + '\'' +
                ", client_secret='" + client_secret + '\'' +
                ", grant_type='" + grant_type + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                '}';
    }
}
