package com.bkgc.bean.security;

/**
 * <p>Title:      UserTokenExpireReturn </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午4:12
 */
public class UserTokenExpireReturn {

    //是否可用，true为可用
    private String available;

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "UserTokenExpireReturn{" +
                "available='" + available + '\'' +
                '}';
    }
}
