package com.bkgc.bean.security;

/**
 * <p>Title:      UserTokenExpireParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午4:10
 */
public class UserTokenExpireParam {

    //token
    private String access_token;

    //资源路径
    private String uri;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "UserTokenExpireParam{" +
                "access_token='" + access_token + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
