package com.bkgc.bean.security;

import lombok.Data;

/**
 * <p>Title:      UserTokenExpireParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午4:10
 */
@Data
public class UserTokenExpireParam {

    //token
    private String access_token;

    //资源路径
    private String uri;
}
